Feature: Api demos

  ##guncelleme iznini bulamadim calismiyor

  Scenario:

    Given Api demos uygulamasini u ac
    And Api demos a tikla
    And Preference e tikla
    And Preference dependencies e tikla
    And Wifi butonunu check yap
    And Wifi setting e tikla
  ##  And Wifi setting e tikla ve text gonder
  ##  And Ok a tikla

  ## duruma gore elementler uzerinde manipulasyon ihtiyaci mevcutsa sorun yasamamak icin(nosuchelement) list ten yararlanmak faydali olabilir

  ## elementleri locate ederken checkable, clickable gibi ozelliklerden yararlanirsak bunlarin degisken oldugunu unutmamak gerekir.Feature:

  ## bizim clickable ilk elementimiz uzerinde manipulasyon sonrasi bir testte clickable olmayabilir.

  ##  plugin = {"pretty", "html:target/default-cucumber-reports"}, "pretty" ile stepleri konsolda gorebiliriz