package searchApp;

import context.ContextUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllPage {

    public boolean findLinkText(String string){
        boolean result = ContextUtil.get().getWebDriverInstance().findElement(By.linkText(string)).isDisplayed();
        return result;
    }

}
