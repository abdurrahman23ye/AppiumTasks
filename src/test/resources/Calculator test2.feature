Feature: Calculator in pre result ile result inin ayni oldugunu verify etme

  Scenario:

    ## sesnsesiondan baglanarak da tap ve benzeri islemler yapilabilir

    Given Kullanici calculator i acar
    And Kullanici "1"sayisina tiklar
    And Kullanici carpma islemini secer
    And Kullanici "5"sayisina tiklar
    And Kullanici esittir isaretine basar
    And Kullanici pre result ile resultin ayni oldugunu dogrular