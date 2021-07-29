<h1 align="center" style="color:green">
 Este projeto foi desenvolvido para realização de um teste de conhecimentos para a empresa Gazeus Games.
</h1>

<p align="center">
<a href="#rocket-tecnologia" style="margin-left: 30px; margin-right: 30px;">Tecnologias</a> |
<a href="#information_source-requisitos-android" style="margin-left: 30px; margin-right: 30px;">Requisitos Android</a> |
<a href="#information_source-atividades" style="margin-left: 30px; margin-right: 30px;">Atividades</a> |
<a href="#love_you_gesture-sobre-o-autor-technologist" style="margin-left: 30px; margin-right: 30px;">Sobre o Autor</a> |
</p>

## :rocket: Tecnologias

- [Appium](https://appium.io/)
- [Cucumber](http://cucumber.io/)
- [Maven](http://maven.apache.org/)
- [Intellij](http://www.jetbrains.com/idea/)
- [NodeJS](https://nodejs.org/en/)
- [Android](https://developer.android.com/studio)
- [Pico Container](http://picocontainer.com/introduction.html)
- [JUnit](https://junit.org/junit5/)
- [Selenium](https://www.selenium.dev/)
- [Gherkin](https://cucumber.io/docs/gherkin/)

<h4 align="center">
 Para rodar o projeto se faz necessario a instalação a parte das ferramentas:<br>APPIUM, NodeJs e Android. 
</h4>

## :information_source: Requisitos Android

* Configurar as variaveis de ambiente do Android SDK.
* Configurar as variaveis de ambiente do Java JDK
* Verificar conectividade do Appium com o device
* Carregar as dependências do projeto( maven )

  <h4 align="center">
  Segue versão que foram utilizadas para desenvolvimento do projeto JDK( 1.8.0_291 ), SDK Platform-Tools( 31.0.2 ), Appium( 1.21.0 ), NodeJS( 12.8.1 )
  </h4>

## :information_source: Atividades

<h2>Atividade 1 - Tranca Jogatina</h2>

- <h3>Atividade 1.1</h3>

<h4  align="left" style="margin-left: 50px;">
    Para executar a atividade basta entrar na pasta: 
    <label style="font-weight: bold; color:yellow;">/src/test/java/Runners</label> 
    e executando a runner TrancaTest, esta atividade vai utilizar a feature TrancaFeature, 
    onde esta descrito os passos da validação do idioma da tela inicial.
</h4> 

<h4 align="left" style="margin-left: 50px;">
 Quando a automação é executada ela gera 3 relatórios, dois deles ficam dentro da pasta 
    <label style="font-weight: bold; color:yellow;">target/reports</label> 
    tendo um relatório em json outro em xml e o terceiro relatório é mostrado no fim da execução com um link do cucumber, segue exemplo:
    <a href="https://reports.cucumber.io/reports/4956629d-b870-424c-9cd2-539cbc909407">reports.cucumber.io/reports/4956629d-b870-424c-9cd2-539cbc909407</a>
</h4>

- <h3>Atividade 1.2 - Teste de Interface</h3>

<h4  align="left" style="margin-left: 50px;">
    Foi desenvolvido 4 cenários de testes de interface, sendo eles: Validar o Tutorial, Validar as Regras di jogo, Alterar as opções do jogo e Retornar a uma partida anterior. 
    Para localizar o BDD com estes 4 testes basta acessar: <label style="font-weight: bold; color:yellow;">src/test/Features/TrancaFeature.feature</label> os teste manuais estão demarcados com um tag: <label style="font-weight: bold; color:yellow;">@testeManual</label>
</h4> 

<h2>Atividade 2 - Paciencia Jogatina</h2>

<h4  align="left" style="margin-left: 50px;">
    Crie um BDD com nome de <label style="font-weight: bold; color:yellow;">src/test/Features/PacienciaFeature.feature</label> onde consta dois fluxos de testes manuais um para validar se as opções de auxilio de jogo estão funcionando corretamente, outro para validar e depois de realizar uma jogada e clicar em reiniciar o contador de tempo volta a zero 
</h4> 

<h2>Atividade 3 - Paciencia Jogatina - Report bug</h2>

<h4  align="left" style="margin-left: 50px;">
  Para a terceira atividade foi desenvolvido um report de um falso bug encontrado no jogo Paciência, onde ele foi descrito dentro de um arquivo que se encontra na pasta: <label style="font-weight: bold; color:yellow;">arquivosExternos/</label>  
  dentro da pasta consta um arquivo em .docx e um video em .mp4 simulando o bug, o arquivo em Doc foi escrito seguindo uma parametro eu utilizo para relatar um bug no Jira ferramenta que utilizamos para controle das historias e bug.
</h4> 

## :love_you_gesture: Sobre o Autor :technologist:

<label style="font-weight: bold;">Nome: </label> <label style="font-weight: bold;">Abdiel Cordeiro</label> 
<br>
<label style="font-weight: bold;">Linkedin: </label> <a href="https://www.linkedin.com/in/abdiel-p-3a775910b/">Abdiel Cordeiro</a>


<h4  align="left" style="margin-left: 50px;">
    Muito obrigado pela oportunidade da realização deste teste, que me fez relembrar coisas que já havia aprendendo como também aprender coisas novas!!!  
</h4> 
:muscle: :thumbsup: