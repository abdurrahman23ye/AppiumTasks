Feature: uiselector

  Scenario:

    ## sadece android ile calisir

  Given Uiselector kullanimi
  And UiSelector ile "1" e bas

    ## Ui selector methodu icin driver in andoid driver olmasi gerekir

  And Uiautomator className ile "5" e bas

    And UiSelector ve text kullanimi