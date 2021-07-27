package StepDefinitions;

import Manager.TestContext;
import PageFactory.TrancaPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class TrancaSteps {

    private TrancaPage trancaPage;
    private TestContext testContext;
    private String idioma;

    public TrancaSteps(TestContext context){
        testContext = context;
        trancaPage = testContext.getPageManager().getTrancaPage();
    }

    @Dado("que o aplicativo esteja aberto no idioma {string}")
    public void que_o_aplicativo_esteja_aberto_no_idioma(String idioma) {
        this.idioma = idioma;
        trancaPage.validaLogo();
    }

    @E("salva o nome do primeiro e segundo botao")
    public void salva_o_nome_do_primeiro_e_segundo_botao() {
        trancaPage.salvaNomePrimeiraLabel();
        trancaPage.salvaSegundoNomeLabel();
    }

    @Então("compara os nomes dos botoes com o respectivo idioma")
    public void compara_os_nomes_dos_botoes_com_o_respectivo_idioma() {
        trancaPage.validaIdiomaTelaInicial(idioma);
    }


}
