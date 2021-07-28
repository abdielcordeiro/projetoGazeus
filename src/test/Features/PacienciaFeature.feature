#language: pt
#Author: Abdiel Cordeiro

Funcionalidade: Paciencia Jogatina

  @testeManual
  Cenario: Utilizar ajudas de jogo
    Dado que esteja na tela inicial do paciencia
    Quando clico em jogar
    E seleciono a opcao de 1 carta
    E clico no botao de dica
    E clico no botao de jogada automatica
    E clico em retornar jogada anterior
    Então valido se não foi movido nem uma das cartas

    @testeManual
    Cenario: Reiniciar um jogo
      Dado que esteja na tela inicial do paciencia
      Quando clico em jogar
      E seleciono a opcao de 1 carta
      E clica em configuracoes e clica em reiniciar jogo
      Então valida que o tempo volto a ser zero


