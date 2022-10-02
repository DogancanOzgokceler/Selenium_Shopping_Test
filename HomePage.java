import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

  
import javax.nasing.directory.DirContext
  
public class HomePage extends BasePage {

  SearchBox searchBox ;
  By cartCountLocator = By.id("nav-cart-count"); //Example
  By cartCountainerLocator = By.id("nav-cart-count-container")//Example
  By acceptCookiesLocator = By.id("ap-cc-accept")//Exemple
  
  public HomePage(WebDriver drive){
    super(driver);
    searchBox = new SearchBox(driver);
  }

   public SearchBox searchBox() {
     return this.searchBox;
  
   }

  public boolean isProductCountUp(){
    return getCartCount() > 0 ;
    
  }

  public void goToCart(){
    click(cartCountainerLocator);
    
  }

  private int getCartCount(){
    String count = find(cartCountLocator).getText();
    return Integer.porseInt(count);
  }


//Cookiest Check
  public void acceptCookies(){
    if(isDisplayed(acceptCookiesLocator)){
      click(acceptCookiesLocator);
    }
  }
  
}

//Doğancan Özgökçeler 2022