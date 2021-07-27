package Runners;

import Manager.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


/**
 * Configurações do Cucumber
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = "StepDefinitions",
        plugin = {"pretty"},
//       plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatorioFinal.html" },
        monochrome = false,
        dryRun = false,
        tags = "@Teste"
)


public class TrancaTest {

    @AfterClass
    public static void writeExtentReport() {
      //System.out.println("ARQ: " + FileReaderManager.getInstance().getConfigReader().getReportConfigPath());
//        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }
}
