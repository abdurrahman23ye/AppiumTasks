Feature: Browser i driver ile calistirma

  Scenario: Amazona git nutella arat

    ## native app uygulanmayacaksa
  ## 1. driver göster gösterilen driverin yüklü versiyon ile uygunlugunu incele
  ## 2. driverin ismini capability e eklemeyi unutma
  ## 3. content text i düzenlemeyi unutma

  Given Kullanici chrome browser i acar
    ## context ayarlanmali
  And Kullanici context secimi yapar

    ##inspect icin //inspect icin chrome://inspect/#devices
  And Kullanici amazon a gider
    And Kullanici arama kutusunda nutella aratir


