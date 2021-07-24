#language: pt
#Author: abdiel.cordeiro@outlook.com

@Teste
Funcionalidade: Teste no jogo Tranca Jogatina

  Contexto:
    Dado que o aplicativo esteja aberto


  Cenário: Alterar o idiota do aplicativo
    Dado preenche formulario de cadastro sucesso "<qntLinhas>"
    E Clica no botão de registrar
    Então Valida usuário cadastrardo com sucesso



