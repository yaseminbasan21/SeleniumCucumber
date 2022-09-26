Feature: US1011 web tablosundaki istenen sutunu yazdırma

  @guru @pr2
  Scenario: TC16 kullanıcı sutun baslıgı ile liste alabilmeli

    Given kullanıcı "guruUrl" anasayfasında
    And "Company",sutunundaki tum degerleri yazdırır
    Then sayfayı kapatır