import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.appium.java_client.PerformsTouchActions;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.By.xpath;


    public class Main {
        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {

            // Set the path to the ChromeDriver executable

            System.setProperty("webdriver.chrome.driver", "C://Users//funsol//chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            Dimension dim =driver.manage().window().getSize();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            // Navigate to the website
            driver.get("https://www.w3schools.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            System.out.println(">>Chrome launch");

            driver.findElement(By.id("search2")).sendKeys("java");
            driver.findElement(By.id("learntocode_searchbtn")).click();

    /*    try {
            driver.findElement(xpath("/hierardroid.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        */
      /*  System.out.println(">>Search for java");
        Thread.sleep(2000);

        int startsee_x=(int)(dim.width*0.5);
        int startsee_y=(int)(dim.height*0.9);

        int endsee_x=(int)(dim.width*0.5);
        int endsee_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee=new TouchAction((PerformsTouchActions) driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee.press(PointOption.point(startsee_x,startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee_x,endsee_y)).release().perform();
        System.out.println(">>Scroll");*/




            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[6]")).click();
            Thread.sleep(2000);
            System.out.println(">>Javascript tab");

            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[6]")).click();
            Thread.sleep(2000);
            System.out.println(">>SQL tab");
            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[7]")).click();
            Thread.sleep(2000);
            System.out.println(">>Python tab");
            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[9]")).click();
            Thread.sleep(2000);
            System.out.println(">>PHP tab");
            driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[11]")).click();
            Thread.sleep(2000);
            System.out.println(">>How to tab");
            driver.navigate().back();

            driver.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).click();
            Thread.sleep(2000);
            System.out.println(">>login");
            Thread.sleep(1000);

            driver.findElement(By.id("//*[@id=\"modalusername\"]")).click();
            //PUT TEXT IN TEXT BAR

            driver.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("Hello World!");
            driver.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys(Keys.RETURN);




//*[@id="w3loginbtn"]
/*
        Thread.sleep(3000);
              // set the path to the chromedriver executable
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

                // create a new ChromeDriver instance
                driver = new ChromeDriver();

                // navigate to the desired web page
                driver.get("https://www.w3schools.com/");

                // scroll down the page
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0, 500)");

                // scroll to a specific element
                WebElement element = driver.findElement(By.id("my-element"));
                js.executeScript("arguments[0].scrollIntoView();", element);

                // close the browser window
                driver.quit();
        System.out.println(">>sccccc");


*/



// ... initialize the driver
            WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/h2[2]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            System.out.println(">>Quit Succssfully");
            driver.quit();


        }
    }