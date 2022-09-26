Feature: US1004 Kullanıcı parametre ile configuration file'i kullanabilmeli


  @pr2
  Scenario: TC07 configuration properties dosyasından parametre kullanımı

    Given kullanıcı "brcUrl" anasayfasında
    Then kullanıcı 2 sn bekler
    And url'nin "blue" icerdigini test eder
    Then sayfayı kapatır

    #hdjhjsfhj