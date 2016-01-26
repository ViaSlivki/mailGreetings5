import org.junit.Test;

public class QA extends Config{

    @Test
    public void qaCert(){
        Login log = new Login(driver);
        log.inputLoginData();
        log.signInButton();
        MailPage create = new MailPage(driver);
        create.CreateMessage();
        CreateMailPage newEmail = new CreateMailPage(driver);
        newEmail.MessageVictim();
        newEmail.CreateHeader();
        newEmail.CreateMessage();
        newEmail.SendMessage();
        System.out.println("Check your email now =)");
    }
}

