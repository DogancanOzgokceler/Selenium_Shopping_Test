import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

  By productNameLocator = new By.ByCssSeloctor("a.a-link-normal span.a-size-sedium ");
  
  public CartPage(WebDriver drive){
    super(driver);
  }

  public boolean checkIfProductAdded(){
    return getProducts().size() > 0;
    
  }

  private List<WebElement> getProducts(){
    return findAll(productNameLocator);
  }
}