package utilities;

import context.ContextUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
    static Boolean rtn = false;

    public static Boolean doubleClick(WebElement objectToDblClick ){
        //Double Click
        Actions act = new Actions(ContextUtil.get().getWebDriverInstance());
        act.moveToElement(objectToDblClick).doubleClick().build().perform();
        return rtn;
    }

    public static Boolean click(String objId ){
        ContextUtil.get().getWebDriverInstance().findElement(By.id(objId)).click();
        return rtn;
    }
    public static void edt_sendKeysEnter(){
        ContextUtil.get().getWebDriverInstance().findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
    }

}

