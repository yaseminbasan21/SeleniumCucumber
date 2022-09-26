#amazon sayfasına gidip sırasıyla nutella, java, elma, armut aratıp
#sonucların arama yaptıgımız kelimeyi icerdigini test edelim

  Feature: US1007 kullanıcı amazonda istedigi kelimeleri aratır

    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanıcı "amazonUrl" anasayfasında
      Then kullanıcı "<istenenKelime>" icin arama yapar
      And sonucların "<istenenKelimeKontrol>" icerdigini test eder
      And sayfayı kapatır


      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella             |
      |java         |java                |
      |elma         |elma                |
      |armut        | armut              |
      