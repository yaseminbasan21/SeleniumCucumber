Feature: US1012 Kullanıcı register yapabilmeli

  @aut
  Scenario: TC17 kullanıcı uygun datalarla register olabilmeli

    Given kullanıcı "automationUrl" anasayfasında
    And user sign in linkine tıklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And sayfayı kapatır