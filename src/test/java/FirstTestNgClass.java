import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNgClass {
    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test (priority = 0)
    public void openWebSite() {
        System.out.println("Let's open the browser");
        driver.navigate().to("https://www.google.com");
    }

    @Test (priority = 1)
    public void signUp() {
        System.out.println("Signing up");
    }

    @Test (priority = 2)
    public void login() {
        System.out.println("Logging in");
    }

    @Test (priority = 3)
    public void addToCard() {
        System.out.println("Add items to card");
    }

    @Test  (priority = 4)
    public void logOut() {
        System.out.println("Logging out");
    }

  
}
