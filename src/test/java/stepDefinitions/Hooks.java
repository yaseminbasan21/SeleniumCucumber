package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
     Cucumber'da step definitions package'ı icerisinde
     @before,@after gibi bir notasyon varsa
     extends testBase dememize gerek kalmadan
     her scenario'dan once ve/veya sonra bu method'lar calısacaktır

     Bu da bizim isteyecegimiz bir durum degildir

     Cucumber'da @before, @after kullanma ihtiyacımız olursa
     bunu stepdefinitions package'ı altında olusturacagımız
     hooks class'ına koyarız

     biz her scenario'dan sonra test sonucunu kontrol edip
     failed olan scenario'lar icin
     screenshot alması amacıyla
     @After method'u kullanacagız
     */

    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshots");
        }
        Driver.closeDriver();

    }
}
