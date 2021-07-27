package Actions;

import Exceptions.AutomationRuntimeException;;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileActions {


    /**
     * Aguarda a quantidade de segundos inseridas
     *
     * @param seconds             tempo em segundos
     * @exception InterruptedException trata a execeção de interrupção
     */
    public static void waitForSeconds(int seconds){
        try{
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException ie){
            throw new AutomationRuntimeException(ie.getMessage());
        }
    }

    /**
     * Realiza uma espera de 2 segundos e depois verifica se o elemento existe
     *
     * @param element elemento que deseja verificar
     * @exception WebDriverException trata o erro da falta do elemento na tela
     *
     */
    public static boolean isDisplayed(MobileElement element){
        waitForSeconds(1);
        try{
            return element.isDisplayed();
        }catch (WebDriverException wde){
            return false;
        }
    }


    /**
     * Aguarda um o tempo escolhido para depois clicar no elemento enviado
     *
     * @param element elemento que deseja verificar
     * @param seconds tem de espera escolhido
     *
     */
    public static void clickWithFluentWait(MobileElement element, int seconds){
        waitForSeconds(seconds);
        if(isDisplayed(element))
            element.click();
    }

    public static String getTextWait(MobileElement element, int seconds){
        waitForSeconds(seconds);
        if(isDisplayed(element))
            return element.getText();
        return null;
    }


    /**
     * Metodo para realizar um espera pelo elemento escolhido
     *
     * @param e               Elemento escolhido
     * @param timeWaitSeconds Tempo de espera em segundos
     * @exception WebDriverException trata se o elemento esta sendo mostrado
     * @return retorna um booleano (true or false)
     */
    public static boolean waitForElements(AndroidDriver driver,MobileElement e, int timeWaitSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeWaitSeconds);

        if (timeWaitSeconds <= 0) {
            throw new AutomationRuntimeException("Não é possivel declara um tempo menor ou igual a 0");
        }

        try {
            waitForSeconds(timeWaitSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(e));
        } catch (WebDriverException sere) {
            throw new AutomationRuntimeException("Elemento não foi localizado \n Mensagem: " + sere.getMessage());
        }
        if (e.isDisplayed())
            return true;
        return false;
    }
}
