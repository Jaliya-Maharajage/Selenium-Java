package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {
  private static final ThreadLocal<WebDriver> TL_DRIVER = new ThreadLocal<>();

  private DriverFactory() {}

  public static WebDriver getDriver() {
    WebDriver driver = TL_DRIVER.get();
    if (driver == null) {
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      // options.addArguments("--headless=new"); // enable for CI
      driver = new ChromeDriver(options);
      TL_DRIVER.set(driver);
    }
    return driver;
  }

  public static void cleanup() {
    WebDriver driver = TL_DRIVER.get();
    if (driver != null) {
      driver.quit();
      TL_DRIVER.remove();
    }
  }
}
