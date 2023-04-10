package a_Java_Practice.a_javaConcepts.ReadingWritingFiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestReadingWritingProperties {
    public static Logger log = Logger.getLogger(TestReadingWritingProperties.class.getName());
    public void readPropertiesFiles() throws IOException {
        try {
            // Reading and Writing Properties file
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objects.properties");
            //FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\a_Java_Practice\\a_javaConcepts\\ReadingPropertyFiles\\objects.properties");
            prop.load(fis);
            System.out.println(prop.getProperty("FirstName"));
            System.out.println(prop.getProperty("LastName"));
            System.out.println(prop.getProperty("Key"));
            System.out.println(prop.getProperty("Age"));
            System.out.println(prop.getProperty("Designation"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void createPropertiesFiles() throws IOException {
        try {
            // Creating and Writing txt file
            File file = new File("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objectsWriting.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objectsWriting.txt");
            BufferedWriter write = new BufferedWriter(fileWriter);
            write.write("This is my first line");
            write.newLine();
            write.write("This is my second line");
            write.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void readTxtFile() throws IOException {
        try {
            // Reading txt file
            FileReader fr = new FileReader("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objectsReading.txt");
            BufferedReader fileReader = new BufferedReader(fr);
            String s = "";
            while ((s = fileReader.readLine()) != null) {
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void CreateExcelFile() throws IOException {
        try {
            // creating workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // creating sheet on the workbook, the HSSFSheet have private constructor
            XSSFSheet sheet1 = workbook.createSheet("FirstSheet");
            XSSFSheet sheet2 = workbook.createSheet("SecondSheet");

            // create row in sheet2
            Row row0 = sheet1.createRow(0);
            Row row1 = sheet1.createRow(1);
            Row row2 = sheet1.createRow(2);

            // create cell in row 0
            Cell cellA = row0.createCell(0);

            // setting cell value
            cellA.setCellValue("Name");

            // repeating above steps for other cells
            Cell cellB = row0.createCell(1);
            cellB.setCellValue("Address");
            Cell cellC = row0.createCell(2);
            cellC.setCellValue("Email");
            Cell cellD = row0.createCell(3);
            cellD.setCellValue("MobileNumber");

            // creating filestream
            File f = new File("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objectsWriting.xlsx");
            // chaining output stream to path
            FileOutputStream fo = new FileOutputStream(f);
            // writing workbook to output stream
            workbook.write(fo);
            // closing the stream
            fo.close();
            System.out.println("Data written in excel file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateExcelFileUsingLoop() throws IOException {
        try {
            // creating workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // creating sheet on the workbook, the HSSFSheet have private constructor
            XSSFSheet sheet2 = workbook.createSheet("SecondSheet");

            for (int rows = 0; rows <= 10; rows++) {
                Row row = sheet2.createRow(rows);
                for (int cells = 0; cells < 10; cells++) {
                    Cell cell = row.createCell(cells);
                    cell.setCellValue((int)(Math.random() * 10));
                }
            }
            // creating filestream
            File f = new File("src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/objectsWriting.xlsx");
            // chaining output stream to path
            FileOutputStream fo = new FileOutputStream(f);
            // writing workbook to output stream
            workbook.write(fo);
            // closing the stream
            fo.close();
            System.out.println("Data written in excel file");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void loggerExample(){
        try {
            Date d = new Date();
            System.out.println(d.toString().replace(":", "_").replace(" ", "_"));
            System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
            PropertyConfigurator.configure("./src/main/java/a_Java_Practice/a_javaConcepts/ReadingWritingFiles/log4j.properties");
            log.info("This is the information log");
            log.error("Here the error logs will be printed");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        TestReadingWritingProperties obj = new TestReadingWritingProperties();
        obj.loggerExample();
    }
}
