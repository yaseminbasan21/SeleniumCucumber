Feature: US1005 dogru kullanıcı adı ve sifre ile giris yapılabilmeli

  @smoke @regression @hmc
  Scenario: TC08 positive login test
    Given kullanıcı "HMCUrl" anasayfasında
    Then Log in yazısına tıklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptıgını kontrol eder
    And sayfayı kapatır