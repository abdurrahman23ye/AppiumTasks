Feature: Uiautomator ile locate

  Scenario: Calculator dan 1 ile 2 i topla sonucu kontrol et

    ## c->->programfiles->(Kapali ise gizli dosyalari ac)->appData->
    ##ya da
    ## c->kullanicilar->(Hangi kullanici ise)->appData->local->android->sdk->tools->uiautomater
    ##ya da
    ## c->kullanicilar->(Hangi kullanici ise)->appData->local->android->sdk->tools->bin->uiautomater

  Given Kullanici calculator uygulamasini acar

    And Kullanici "1" rakamina tiklar
    And Kullanici toplama isaretine tiklar
    And Kullanici "5" rakamina tiklar
    And Kullanici esittir isaretine tiklar
    And Kullanici pre result ile resultin esit oldugunu dogrular

    ## ikinci acilista hiyearşi hatasi verirse cmd->adb reconnect ile sorun cozuluyor