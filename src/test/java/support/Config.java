package support;

public final class Config {
  private Config() {}

  public static String baseUrl() {
    String fallback = "https://pickme.lk/";
    return System.getProperty("baseUrl", fallback);
  }
}
