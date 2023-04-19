package testNg.parallelTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

public class TestParallelDataProvider {
    @Test(dataProvider = "dp1")
    public void doLogin(String browser) throws InterruptedException {
        Date d = new Date();
        System.out.println("browser name "+browser+" datetime: "+d);
        Thread.sleep(2000);
    }
    @DataProvider(name = "dp1",parallel = true)
    public static Object[][] getData1() {
        Object[][] data = new Object[2][1];
        data[0][0] = "chrome";
        data[1][0] = "firefox";
        return data;
    }
}
