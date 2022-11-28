package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    public static void configuration() {

        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();
        Configuration.browserSize = config.browserSize();
        Configuration.browserVersion = config.browserVersion();
        String remoteUrl = config.remoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }

}
