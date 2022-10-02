import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.list;

public class ProductPage extends BasePage {

  By shippingOptionLocator = By.id("p_n_nfree_shipping_eligble-title");//Exaple
  By productNameLocator = new By.ByCssSelector("span.a-size-base-plus"); //Exaple
  
  public ProductPage(WebDriver drive){
    super(driver);
  }

  public boolean 1sOnProductPage() {
    return isDisplayed(shipingOptionLocator);
    
  }
  public void selectProduct(int 1){
    getAllProducts().get(1).click()wi;
    
  }

  private List<WebElement> getAllProducts(){
    return findAll(productNameLocator);
  }
}