package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {
     Workbook workbook;

    @Given("kullanıcı excel dosyasını kullanılabilir hale getirir")
    public void kullanıcı_excel_dosyasını_kullanılabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        workbook= WorkbookFactory.create(fis);

    }
    @Then("{int}.satırdaki {int}.hucreyi yazdırır")
    public void satırdaki_hucreyi_yazdırır(Integer satır, Integer sutun) {
        String istenenHucreYazısı=workbook
                .getSheet("Sayfa1")
                .getRow(satır-1)
                .getCell(sutun-1)
                .toString();
        System.out.println(satır+ ". satır " + sutun + ". sutundaki deger : " +istenenHucreYazısı);

    }
    @Then("baskenti Jakarta olan ulke ismini yazdırır")
    public void baskenti_jakarta_olan_ulke_ismini_yazdırır() {
      //for loop ile tum satırları kontol etmem gerekiyor
      //bunun icin de satır sayısına ihtiyacım var
      int satırSayısı=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <=satırSayısı ; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
                System.out.println("Baskenti Jakarta olan ulke : " +
                        workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }

    }
    @Then("ulke sayısının {int} oldugunu test eder")
    public void ulke_sayısının_oldugunu_test_eder(Integer ulkeSayısı) {
        int actualUlkeSayısı=workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayısı==actualUlkeSayısı);

    }
    @Then("Fiziki olarak kullanılan satır sayısının {int} oldugunu test eder")
    public void fiziki_olarak_kullanılan_satır_sayısının_oldugunu_test_eder(Integer fizikiKullanılanSatır) {

        int actualFizikiKullanılanSatır=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanılanSatır==actualFizikiKullanılanSatır);

    }

}
