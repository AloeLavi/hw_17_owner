package config;


import org.aeonbits.owner.Config;



@Config.Sources({
           "classpath:${env}.properties"

    })

    public interface WebDriverConfig extends Config {


    @Key("baseUrl")
    @DefaultValue("https://the-internet.herokuapp.com")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("browserVersion")
    @DefaultValue("100")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();

    }