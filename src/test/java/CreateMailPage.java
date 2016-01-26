import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateMailPage {
    public WebDriver driver;
    String reciepent = "olexandr.bilous@gmail.com";
    String header = "Hello from Java noooobas";
    String body = "Thanks for all. I'm doing my best =)";

    public CreateMailPage(WebDriver driver) {
        this.driver = driver;
    }

    By whomLocator = By.id("to");
    By headerLocator = By.xpath("html/body/div[4]/div[5]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]");
    By bodyLocator = By.id("text");
    By sendLocator = By.xpath("html/body/div[4]/div[5]/div[1]/div[1]/p[1]/input[1]");

    public void MessageVictim() {
        driver.findElement(whomLocator).sendKeys(reciepent);
    }

    public void CreateHeader() {
        driver.findElement(headerLocator).sendKeys(header);
    }

    public void CreateMessage() {
        driver.findElement(bodyLocator).sendKeys(body);
    }

    public void SendMessage() {
        driver.findElement(sendLocator).click();
    }




}

