@tumu
Feature: US1001 Kullanıcı Amazon Sayfasında Arama Yapar

  @nutella @ikisi
  Scenario: TC01 kullanıcı amazonda Nutella aratır

    Given kullanıcı amazon anasayfasında
    Then kullanıcı Nutella icin arama yapar
    And sonucların Nutella icerdigini test eder
    And sayfayı kapatır

    @java @ikisi @sıralı
    Scenario: TC02 kullanıcı amazonda Java Aratır
      Given kullanıcı amazon anasayfasında
      Then kullanıcı Java icin arama yapar
      And sonucların Java icerdigini test eder
      And sayfayı kapatır

      @iphone @pr1
      Scenario: TC03 kullanıcı iphone aratır
        When kullanıcı amazon anasayfasında
        And kullanıcı iphone icin arama yapar
        Then sonucların iphone icerdigini test eder
        And sayfayı kapatır