package utilities;

import context.ContextUtil;
import driver.WebDriverFactory;
import dto.Browser;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class BeforeAfterScn {
    public static void before() {

            Browser browserDto = new Browser();
            browserDto.setName("Chrome");
            String gridhubul = "";
            WebDriverFactory.initialize(gridhubul, browserDto);

    }
    
    
    public static void after() {
        WebDriverFactory.closeBrowser();
        WebDriverFactory.quitDriver();
    }
}
