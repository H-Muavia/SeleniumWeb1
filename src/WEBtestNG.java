import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.openqa.selenium.Dimension;
import java.io.File;
import java.time.Duration;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;




public class WEBtestNG {

    private WebDriver driver;
    private WebDriver ChromeDriver;
    private String baseUrl;

    @BeforeClass
    public void Start() throws InterruptedException {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\funsol\\Documents\\ChoromeDriverexe\\chromedriver.exe");
        // Launch Chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver = new ChromeDriver();

        // Navigate to the web page where the file input element is located
        driver.get("https://www.w3schools.com/");
        System.out.println(" >> Open chrome and open website");
    }

    @Test(priority = 1)
    public void SearcHOMESCREEN() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("search2")).sendKeys("java");
        driver.findElement(By.id("learntocode_searchbtn")).click();
        System.out.println(" >> Put text for specific topic");
    }

    @Test(priority = 2)
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[6]")).click();
        Thread.sleep(2000);
        System.out.println(">>Javascript tab");
    }


    @Test(priority = 3)
    public void SQLtab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[6]")).click();
        Thread.sleep(2000);
        System.out.println(">>SQL tab");
    }

    @Test(priority = 4)
    public void PYTONatb() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[7]")).click();
        Thread.sleep(2000);
        System.out.println(">>Python tab");
    }

/*
   @Test(priority = 5)
    public void sve() throws InterruptedException {
        Thread.sleep(2000);
        int startrf_x = (int) (dim.width * 0.5);
        int startrf_y = (int) (dim.height * 0.3);

        int endrf_x = (int) (dim.width * 0.5);
        int endrf_y = (int) (dim.height * 0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tsrf = new TouchAction((PerformsTouchActions) driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsrf.press(PointOption.point(startrf_x, startrf_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endrf_x, endrf_y)).release().perform();
        System.out.println(">>>> Refresh screen 1st time");

    }*/

    @Test(priority = 6)
    public void svw() throws InterruptedException {

    }

    @Test(priority = 7)
    public void svr() throws InterruptedException {

    }

    @Test(priority = 8)
    public void svrt() throws InterruptedException {

    }

    @Test(priority = 9)
    public void sv() throws InterruptedException {

    }


    @AfterClass
    public void afterClass() {

        driver.quit();
    }
}