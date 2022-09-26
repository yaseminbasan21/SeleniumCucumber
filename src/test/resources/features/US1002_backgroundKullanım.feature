@wip
Feature:US1002 Kullanıcı ortak adımları Background ile calıstırır

   Background: ortak adım
     Given kullanıcı amazon anasayfasında

     Scenario: TC04 amazon nutella arama
       And kullanıcı Nutella icin arama yapar
       Then sonucların Nutella icerdigini test eder
       And sayfayı kapatır

       @pr2
       Scenario: TC05 amazon java arama
         And kullanıcı Java icin arama yapar
         Then sonucların Java icerdigini test eder
         And sayfayı kapatır
