package utilities;

import driver.WebDriverFactory;
import dto.Browser;

import java.net.MalformedURLException;

public class BeforeScn {
    public static void init() {
        Browser browserDto = new Browser();
        browserDto.setName("Chrome");
        String gridhubul="";
        WebDriverFactory.initialize(gridhubul, browserDto);

    }
}
