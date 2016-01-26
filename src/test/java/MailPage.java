import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage {
    public WebDriver driver;

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    By createMessageLocator = By.xpath("html/body/div[1]/div[4]/ul/li[2]/a");

    public void CreateMessage() {
        driver.findElement(createMessageLocator).click();
    }
}

