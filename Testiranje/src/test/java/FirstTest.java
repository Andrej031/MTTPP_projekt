//FirstTest.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://www.zara.com/hr/";
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }
    @Test
    public void loginFail() throws  InterruptedException {
        WebElement loginBox = driver.findElement(By.xpath("//*[@id=\"header-actions\"]/li[1]/a"));
        loginBox.click();
        Thread.sleep(2000);
        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailBox.sendKeys("andrej3245423andrej@gmail.com");
        Thread.sleep(1000);
        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.sendKeys("abcdefgh");
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();
        Thread.sleep(4000);
    }

    @Test
    public void loginSuccess() throws  InterruptedException {
        WebElement loginBox = driver.findElement(By.xpath("//*[@id=\"header-actions\"]/li[1]/a"));
        loginBox.click();
        Thread.sleep(2000);
        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailBox.sendKeys("andrej3245423andrej@gmail.com");
        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.sendKeys("Lozinka123");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();
        Thread.sleep(5000);
    }

    @Test void kontakt() throws InterruptedException {
        loginSuccess();
        WebElement kontaktButton = driver.findElement(By.xpath("//*[@id=\"header-actions\"]/li[2]/a"));
        kontaktButton.click();
        Thread.sleep(5000);
    }

    @Test
    public void azurirajPodatke() throws  InterruptedException {
        loginSuccess();
        WebElement profileBox = driver.findElement(By.xpath("//*[@id=\"header-actions\"]/li[1]/a"));
        profileBox.click();
        Thread.sleep(3000);
        WebElement podaciBox = driver.findElement(By.xpath("//*[@id=\"account-menu\"]/article[5]/h3/a"));
        podaciBox.click();
        Thread.sleep(3000);
        WebElement prezimeBox = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        prezimeBox.click();
        Thread.sleep(3000);
        prezimeBox.sendKeys("123");
        Thread.sleep(2000);
        WebElement azurirajButton = driver.findElement(By.xpath("//*[@id=\"personal-info-form\"]/div[4]/button"));
        azurirajButton.click();
        Thread.sleep(3000);
        WebElement prihvatiButton = driver.findElement(By.xpath("//*[@id=\"user-area\"]/div[6]/div/div[3]/div/section/button"));
        prihvatiButton.click();
        Thread.sleep(3000);
    }

    @Test
    public void promijenijezik() throws  InterruptedException {
        loginSuccess();
        WebElement info = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[10]/a/span"));
        info.click();
        Thread.sleep(3000);
        WebElement pomoc = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[10]/ul[1]/li[2]/a/span"));
        pomoc.click();
        Thread.sleep(3000);
        WebElement eng = driver.findElement(By.xpath("//*[@id=\"languages\"]/ul/li[2]/a"));
        eng.click();
        Thread.sleep(3000);
    }





    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}