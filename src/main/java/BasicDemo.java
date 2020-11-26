import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome is opened & operation or else task is performed");
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("sagarchavadi@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("1234456");
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(8000);
        driver.close();
        driver.quit();

    }
}
