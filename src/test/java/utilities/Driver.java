package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private  Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){ //her seferinde yeni bir sayfa acılsın istemedigimiz icin sadece en basta hic acılmamıs driver'ı olusturuyoruz
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(); //getDriver() method'u her seferinde driver'a yeni bir driver olusturur,yeni bir browser

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver; //eger daha once chromeDriver degeri olusturulmussa yukarısı calısmıcak, var olan driver geri donucek
    }

    public static void closeDriver(){
        if (driver!=null){  //driver'a deger atanmıs
            driver.close(); //atanmıssa kapat
            driver=null;
        }

    }
}
