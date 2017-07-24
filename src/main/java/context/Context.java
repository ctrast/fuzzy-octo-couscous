package context;

import org.openqa.selenium.WebDriver;

public class Context {

        private WebDriver webDriverInstance = null;

        public WebDriver getWebDriverInstance() {
            return webDriverInstance;
        }

        public void setWebDriverInstance(WebDriver webDriverInstance) {
            this.webDriverInstance = webDriverInstance;
        }
}

