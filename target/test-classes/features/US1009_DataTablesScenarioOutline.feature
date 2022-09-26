Feature: US1009 Datatables sitesine 5 farklı giris yapalım

  @datatable
  Scenario Outline: TC14 kullanıcı 5 farklı kayıt girisi yapabilmeli
    
    When kullanıcı "datatablesUrl" anasayfasında
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanıcı 1 sn bekler
    And soyisim bolumune "<lastName>" yazar
    And kullanıcı 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanıcı 1 sn bekler
    And ofis bolumune "<office>" yazar
    And kullanıcı 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanıcı 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanıcı 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanıcı 1 sn bekler
    And Create tusuna basar
    When kullanıcı "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayı kapatır

    Examples:
    |firstname|lastName|position|office|extension|startDate|salary|
    |Alim     |Alim    |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05  |11000|
    |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|
