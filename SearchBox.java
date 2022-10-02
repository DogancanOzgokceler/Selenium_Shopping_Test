import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extands BasePage{

  By searchBoxLocator = By.id("twotabsearchtextbox");//Exaple
  By submitButtonLocator = By.id("nav-search-submit-button");
  

 public SearchBox(WebDriver driver){
   super(driver);
 }

 public void search(String text){
   typhe(searchBoxLocator , text);
   click(submitButtonLocator);
  
 }

  
}