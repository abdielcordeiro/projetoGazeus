package PageFactory;

import Actions.MobileActions;
import BaseClass.Idioma;
import Manager.FileReaderManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrancaPage {

    private String primeiraLabel, segundaLabel;

    public TrancaPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(50)), this);
    }

    @FindBy(how = How.ID, using = "imageViewLogo")
    private MobileElement logo;

    @FindBy(how = How.ID, using = "buttonSinglePlayer")
    private MobileElement bnt_jogar;

    @FindBy(how = How.ID, using = "buttonMultiPlayer")
    private MobileElement bnt_multiplayer;

    @FindBy(how = How.ID, using = "imageViewCrossPromotion")
    private MobileElement bnt_play;

    @FindBy(how = How.ID, using = "com.jogatina.tranca:id/buttonInviteFriends")
    private MobileElement bnt_convidar;


    public void validaLogo() {
        MobileActions.waitForSeconds(5);
        assertTrue("Não esta sendo apresentado a tela inicial", MobileActions.isDisplayed(logo));
    }

    public void salvaNomePrimeiraLabel() {
        primeiraLabel = MobileActions.getTextWait(bnt_jogar, 5);
    }

    public void salvaSegundoNomeLabel() {
        segundaLabel = MobileActions.getTextWait(bnt_multiplayer, 5);
    }

    public void validaIdiomaTelaInicial(String idioma) {

        Idioma ingles = new Idioma(), portugues = new Idioma();
        portugues.setListPalavras(new ArrayList<>(Arrays.asList("JOGAR AGORA!", "JOGAR COM PESSOAS")));
        ingles.setListPalavras(new ArrayList<>(Arrays.asList("PLAY NOW!", "MULTIPLAYER")));

        switch (idioma) {
            case "portugues":
                assertEquals("Nome do primeiro botão esta incorreto!!!", portugues.getListPalavra(0), primeiraLabel);
                assertEquals("Nome do segundo botão esta incorreto!!!", portugues.getListPalavra(1), segundaLabel);
                FileReaderManager.getInstance().getConfigReader().gravarFileReader("language","en");
                FileReaderManager.getInstance().getConfigReader().gravarFileReader("locale","us");
                break;
            case "ingles":
                assertEquals("First button name is incorrect!!!", ingles.getListPalavra(0), primeiraLabel);
                assertEquals("Second button name is incorrect!!!", ingles.getListPalavra(1), segundaLabel);
                FileReaderManager.getInstance().getConfigReader().gravarFileReader("language","pt");
                FileReaderManager.getInstance().getConfigReader().gravarFileReader("locale","br");
            default:
                Assert.fail("Não foi digitado um idioma valido!!!");
        }
    }

}
