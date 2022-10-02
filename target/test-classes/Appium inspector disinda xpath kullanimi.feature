Feature: Appium xpath kullanimi

  Scenario: Apium inspector disinda xpath

    Given Kullanici uygulamayi acar

    ## seleniumdaki xpath kullaniminin aynisini yine inpectorden aldigimiz artribute ve value ile kullanabiliiz

    ## örnek //*[@class='android.widget.EditText']

   ## And Kullanici search box a deve yazar

    ## text e ihtiyac varsa genelde şu syntax i uyarlama ise yariyor
  ## //android.widget.TextView[@text='YouTube']
  ## //android.widget.TextView[@text,'YouTube']  , e dikkat
    # # //android.widget.TextView[contains(@text,'')]


   And Text ile youtube a tiklar

    And Kullanici cikis yapar