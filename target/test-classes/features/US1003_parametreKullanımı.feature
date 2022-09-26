Feature: US1003 kullanıcı parametre kullanarak arama yapabilmeli

  @parametre @sıralı @pr1
  Scenario: TC06 kullanıcı parametre ile amazonda arama yapabilmeli
    Given kullanıcı amazon anasayfasında
    And kullanıcı "Java" icin arama yapar
    And sonucların "Java" icerdigini test eder
    Then sayfayı kapatır