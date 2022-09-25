Feature: pom ile chrome testi

  Scenario: Amazon a git nutella arat ilk sonucu kontrol et


    ##Seleniumdaki klasik pom page factory ve findby anotasyonuyla chromium da kullanılabilir sorun yok.

    ## // constructor fark etmiyor standart selenium pom veya appium pom constructor i fark etmiyor
      # ama context chromium ise ve xpath olarak da web sayfasi inspect edildiyse
    #
    #        // findby/selenium anotasyonu kullanilacak androidfindby calismiyor.

    Given Kullanici "amazon" sitesine gider
    And Kullamici delivery option i kapatir alternatif
    And Kullainici nutella aratir alternatif