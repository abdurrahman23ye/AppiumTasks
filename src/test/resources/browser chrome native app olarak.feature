Feature: Native app
  Scenario: Amazon a git bir sey arat

    ## intelij session ile inpector session im birlikte calismiyor. inspectordan yürüyorum ama

    ## bu sorun mu yoksa dogali bu mu emin olamadim.

    ## Native de genelde set edilen ayarlar kalici oluyor cerez vs gibi

    Given Kullanici chrome uygulamsini acar
    And Kullanici amazon a gider native
 ##   And Kullanici deliver adresini degistirmemeyi secer
    And Kullanici arama kutusuna at yazar
    And Kullanici arama kutusuna tiklar ve at yazar
    And Kullanici arama butonuna tiklar

