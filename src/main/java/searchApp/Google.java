package searchApp;

import context.ContextUtil;
import org.openqa.selenium.By;
import utilities.Wait;

//google home page
public class Google {
    static Boolean rtn = false;

    public void googSearch_edt_sendKeys(String string){
        ContextUtil.get().getWebDriverInstance().findElement(By.id("lst-ib")).sendKeys(string);
    }
    public void googSearch_btn_click(){
        ContextUtil.get().getWebDriverInstance().findElement(By.name("btnK")).click();
        rtn = Wait.webDriverWaitId(30, "resultStats");

    }
    public void googSearchMagGlass_btn_click(){
        ContextUtil.get().getWebDriverInstance().findElement(By.id("_fZl")).click();
    }

}
