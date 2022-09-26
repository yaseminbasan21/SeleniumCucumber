Feature: US1008 kullanıcı farklı yanlıs sifre ve kullanıcı adıyla giris yapamaz

  @negative
  Scenario Outline: TC13 yanlıs kullanıcı adı ve sifrelerle giris yapılamaz
    Given kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapılamadıgını kontrol eder
    And sayfayı kapatır

    Examples:
    |username|password|
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|