package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import support.DriverFactory;

@SuppressWarnings("unused")
public class Hooks {

  @Before
  public void beforeScenario() {
    // Lazily initialised in steps when first requested
    // Kept here if you want to eagerly spin up the browser:
    DriverFactory.getDriver();
  }

  @After
  public void afterScenario() {
    DriverFactory.cleanup();
  }
}
