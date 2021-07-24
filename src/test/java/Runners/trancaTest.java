package Runners;


import Manager.FileReaderManager;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Configurações do Cucumber
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = "src/test/java/StepDefinitions",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatorioFinal.html" },
        monochrome = false,
        dryRun = false,
        tags = "@Teste"
)


public class trancaTest {

    @AfterClass
    public static void writeExtentReport() {
        System.out.println("ARQ: " + FileReaderManager.getInstance().getConfigReader().getReportConfigPath());
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

    }
}
