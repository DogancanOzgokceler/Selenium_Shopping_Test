import io.github.bonigarcia.wda.WebDriveManager //Kendimde koda eklenebilir
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import.org.openqua.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

  WebDriver driver;

@BeforeAll
public void setup(){
webDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("Buraya Sitenin Adresi Yazılacak")
  driver.manage().window().maximize();
}

@AfterAll
public void tearDown[]{
  driver.quit();
}
  
}