Feature: US1010 herokuapp Delete Testi

  @herokuapp
  Scenario: TC15 herokuapp'dan delete butonu calısmalı


      Given kullanıcı "herokuappUrl" anasayfasında
      And add element butonuna basar
      And kullanıcı 3 sn bekler
      Then Delete butonu gorunur oluncaya kadar bekler
      And Delete butonunun gorunur oldugunu test eder
      Then Delete butonuna basar
      And Delete butonunun gorunmedigini test eder
      And sayfayı kapatır