import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest1 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secrete_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login_button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
