
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage 

  By addToCartButtonLocator = By.id("add-to-cart-button"); //Exeample

  public ProductDetailPage(WebDriver drive){
    super(driver);
  }

  public boolean 1sOnProductDetailPage(){
    return isDisplayed(addToCartButtonLocator);
    
  }

  public void addToCart() {
    click(addToCarButtonLocator)İ;
    
  }
}