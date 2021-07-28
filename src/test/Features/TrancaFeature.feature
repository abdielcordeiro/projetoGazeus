#language: pt
#Author: Abdiel Cordeiro

@Teste
Funcionalidade: Tranca Jogatina


  Esquema do Cenario: Cenário: Validar idioma tela inicial
    Dado que o aplicativo esteja aberto no idioma "<idioma>"
    E salva o nome do primeiro e segundo botao
    Então compara os nomes dos botoes com o respectivo idioma

    Exemplos:
      | idioma    |
      | portugues |
      | ingles    |

