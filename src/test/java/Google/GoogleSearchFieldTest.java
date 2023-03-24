package Google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchFieldTest {

    @BeforeMethod
    public void openBrowser(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void typeSearchField(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebElement m = driver.findElement(By.xpath("//input[@name='q']"));
        m.sendKeys("Brooklyn");
        m.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]")).click();
        driver.navigate().back();
        driver.navigate().back();

        WebElement m1 = driver.findElement(By.xpath("//input[@name='q']"));
        m1.sendKeys("Queens");
        m1.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]")).click();
        driver.navigate().back();
        driver.navigate().back();

        WebElement m2 = driver.findElement(By.xpath("//input[@name='q']"));
        m2.sendKeys("Bronx");
        m2.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]")).click();
        driver.navigate().back();
        driver.navigate().back();

    }
    @AfterMethod
    public void closeBrowser(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.quit();
    }
}
