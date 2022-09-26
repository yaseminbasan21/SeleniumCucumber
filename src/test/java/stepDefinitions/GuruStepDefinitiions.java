package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitiions {

    GuruPage guruPage = new GuruPage();

    @Given("{string},sutunundaki tum degerleri yazdırır")
    public void sutunundaki_tum_degerleri_yazdırır(String istenenSutun) {

        List<WebElement> tabloBaslıkListesi = guruPage.baslıkListesi; //listeyi kullanabilmek ici bir konteynıra atamıs oldum
        //listemiz webelementlerden olusuyor
        //dolayısıyla bu webelementlerden hangisi
        //istenen sutun baslıgını tasıyor bilemeyiz

        int istenenBaslıkIndexi =-3; // -'li deger yazıyorum ki index'ten gelmeyecek bir sey olsun
        for (int i = 0; i < tabloBaslıkListesi.size(); i++) {
            if (tabloBaslıkListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslıkIndexi = i+1; //liste'nin index'i 1'den basladıgı icin
                break;
            }
        }
        //istenen baslıgın hangi index'te oldugunu bulduk
        //aradıgım index'i istenenBaslıkIndex'inde depoluyorum

        //for loop ile tum sutun baslıklarını bana verilen istenenSutun degeri ile karsılastırdım
        //loop bittiginde baslıgın bulunup bulunmadıgını kontrol etmek
        //ve bulundu ise yoluma devam etmek istiyorum

        if (istenenBaslıkIndexi != -3) {//baslık bulundu
            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslıkIndexi+"]"));//dinamik yaptık
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }
        } else {//baslık bulunamadı
            System.out.println("istenen baslık bulunamadı");
        }
    }
}


