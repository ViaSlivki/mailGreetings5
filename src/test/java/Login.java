import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    public WebDriver driver;
    String login = "creatingtests";
    String password = "poqwerty";

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    By loginLocator = By.xpath("html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/p[2]/input");
    By passLocator = By.xpath("html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/ul/li[1]/input");
    By signInLocator = By.xpath("html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input");



    public void inputLoginData(){
        driver.findElement(loginLocator).sendKeys(login);
        driver.findElement(passLocator).sendKeys(password);
    }

    public void signInButton(){
        driver.findElement(signInLocator).click();
    }

}
