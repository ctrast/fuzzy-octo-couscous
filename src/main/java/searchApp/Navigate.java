package searchApp;

import context.ContextUtil;
import org.openqa.selenium.By;

public class Navigate {
    public void Google(){
        ContextUtil.get().getWebDriverInstance().navigate().to("www.google.com");
    }
    public void All(){
        ContextUtil.get().getWebDriverInstance().findElement(By.linkText("AllPage")).click();
    }
    public void News(){
        ContextUtil.get().getWebDriverInstance().findElement(By.linkText("News")).click();
    }
    public void Images(){
        ContextUtil.get().getWebDriverInstance().findElement(By.linkText("Images")).click();
    }
    public void Videos(){
        ContextUtil.get().getWebDriverInstance().findElement(By.linkText("Videos")).click();
    }
}
