//ππΈπ 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.list;


public class BasePage{

  WebDriver driver;

  public BasePage(WebDriver drive){
    this.driver = driver;
  }

  public WebElement find(By locator){
    return driver.findElement(locator);
    
  }
  public List<WebElement> findAll(By locator){
    find(locator).click();
    
  }

  public void type(By locator , String text){
    find(locator).sendKeys(text);
  }

  public Boolean isDisplayed(By locator){
    return find(locator).isDisplayed();
  }



  
}