package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
   AmazonPage amazonPage=new AmazonPage();

    @Given("kullanıcı amazon anasayfasında")
    public void kullanıcı_amazon_anasayfasında() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanıcı Nutella icin arama yapar")
    public void kullanıcı_nutella_icin_arama_yapar() {
       amazonPage.aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Then("sonucların Nutella icerdigini test eder")
    public void sonucların_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();
    }

    @Then("kullanıcı Java icin arama yapar")
    public void kullanıcı_java_icin_arama_yapar() {
        amazonPage.aramakutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("sonucların Java icerdigini test eder")
    public void sonucların_java_icerdigini_test_eder() {
        String arananKelime="Java";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @And("kullanıcı iphone icin arama yapar")
    public void kullanıcıIphoneIcinAramaYapar() {
        amazonPage.aramakutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("sonucların iphone icerdigini test eder")
    public void sonuclarınIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }
    @Given("kullanıcı {string} icin arama yapar")
    public void kullanıcı_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramakutusu.sendKeys(istenenKelime+ Keys.ENTER);
    }
    @Given("sonucların {string} icerdigini test eder")
    public void sonucların_icerdigini_test_eder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanıcı {string} anasayfasında")
    public void kullanıcıAnasayfasında(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanıcı {int} sn bekler")
    public void kullanıcıSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
