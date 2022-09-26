#hotel my camp sitesinde 3 adet negative test senaryosu olusturalım
#1- dogru username-yanlıs password
#2- yanlıs username-dogru password
#3- yanlıs username-yanlıs password

  Feature: US1006 yanlıs bilgilerle siteye giris yapılamaz

    Scenario: TC09 yanlıs password ile giris yapılamaz
      Given kullanıcı "HMCUrl" anasayfasında
      Then Log in yazısına tıklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapılamadıgını kontrol eder
      And sayfayı kapatır

      Scenario: TC10 yanlıs kullanıcı adı ile giris yapılamaz
        Given kullanıcı "HMCUrl" anasayfasında
        Then Log in yazısına tıklar
        And gecersiz username girer
        And gecerli password girer
        And Login butonuna basar
        Then sayfaya giris yapılamadıgını kontrol eder
        And sayfayı kapatır

        Scenario: TC11 yanlıs kullanıcı adı ve yanlıs sifre ile giris yapılamaz
          Given kullanıcı "HMCUrl" anasayfasında
          Then Log in yazısına tıklar
          And gecersiz username girer
          And gecersiz password girer
          And Login butonuna basar
          Then sayfaya giris yapılamadıgını kontrol eder
          And sayfayı kapatır