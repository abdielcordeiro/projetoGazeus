package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * Configurações do Cucumber
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = "StepDefinitions",
        plugin = {"pretty", "json:target/reports/relatorio.json", "junit:target/reports/relatorio.xml"},
        monochrome = false,
        dryRun = false,
        tags = "@Tranca"
)

public class TrancaTest {

}
