Feature: pom ile chrome testi

  Scenario: Amazon a git nutella arat ilk sonucu kontrol et


    ##Seleniumdaki klasik pom page factory ve findby anotasyonuyla chromium da kullanılabilir sorun yok.

    Given Kullanici "amazon" sitesine gider
    And Kullamici delivery option i kapatir
    And Kullainici nutella aratir