Feature: Calculator tasks
  Scenario: Kullanici calculator ile bir islem yapar

    Given Kullanici calculator uygulamasini acar
    And Kullanici "1" rakamina basar
    And Kullanici arti isaretine basar
    And Kullanici "3" rakamina basar
    And Kullanici esittir isaretine basar
    And Kullanici sonucun dort oldugunu dogrular