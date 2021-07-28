#language: pt
#Author: Abdiel Cordeiro

Funcionalidade: Tranca Jogatina

  @Tranca
  Esquema do Cenario: Validar idioma tela inicial
    Dado que o aplicativo esteja aberto no idioma "<idioma>"
    E salva o nome do primeiro e segundo botao
    Então compara os nomes dos botoes com o respectivo idioma

    Exemplos:
      | idioma    |
      | portugues |
      | ingles    |

  @testeManual
  Cenario: Valida o fluxo tutorial
    Dado que esteja na tela inicial do tranca
    Quando clico no botao de configuracao
    E clico em "Tutorial"
    E valido a tela de inicial do tutorial e clico em proximo
    E clico em proximo na mensagem
      | Este é o monte       |
      | Este é o lixo        |
      | Aqui estão os Mortos |
    Quando clico em proximo para aprender a comprar cartas
    E clico no monte de cartas e clico em proximo
    E seleciono as cartas indicadas e clico na mesa
    E clico em proximo na mensagem da nossa area de jogo e proximo na area de jogo adversaria
    E clico em proximo para aprender a realizar um descarte
    Quando seleciono a carta e clico no lixo e clico em proximo
    E clico no botao de ordenar as cartas e clico em proximo
    Então valido a mensagem de conclusao do tutorial e clico em jogar

  @testeManual
  Cenario: Valida as regras do jogo
    Dado que esteja na tela inicial do tranca
    Quando clico no botao de configuracao
    E clico em "Regras da Tranca"
    E rolo a tela ate o final
    Então valido a tabela dos pontos

  @testeManual
  Cenario: Altera as opções de jogo
    Dado que esteja na tela inicial do tranca
    Quando clico em jogar agora
    E clico em jogar 2 jogadores e fecho a propaganda
    E clico nos tres risquinhos
    E altero a velocidade de animacao o tipo do baralho e a cor da mesa
    Quando clico no em fechar
    Então valido que foi alterado as opcoes de jogo

    @testeManual
    Cenario: Voltar para o jogo
      Dado que esteja na tela inicial do tranca
      Quando clico em jogar agora
      E clico em jogar 2 jogadores e fecho a propaganda
      E clico nos tres risquinhos
      E clico em Abandonar partida e clico em sair
      E clico em jogar agora
      Então valido a mensagem de retornar a partida anterior


