package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"
            },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@aut",
        dryRun = false
)
public class TestRunner {
    /*
    Bir framework'de bir tek Runner class'ı yeterli olabilir.
    Runner class'ında class body'de hic bir sey olmaz.
    Runner class'ımızı onemli yapan 2 adet annotaion vardır

     @RunWith(Cucumber.class) notasyonu Runner class'ına calısma ozelligi katar
     Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayı tercih ediyoruz


     features: Runner dosyasının feature dosyalarını nereden bulacagını tarif eder
     glue: step definitions dosyalarını nerede bulacagımızı gosterir
     tags: o an hangi tag'ı calıstırmak istiyorsak onu belli eder

     dryRun:iki secenek var
     dryRun=true ; yazdıgımızda Testimizi calıstırmadan sadece eksik adımları bize verir
     dryRun=false ; yazdıgımızda testlerimizi calıstırır
     */


}
