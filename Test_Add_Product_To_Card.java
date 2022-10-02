//Doğancan Özgökçeler Balıkesir -Ayvalık 3:09 AM 10/2/2022 Son Kontroller
//Do a barrel roll
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test_Add_Product_To_Card extends BaseTest {

@Test
@Order(1) 
  public void search_a_product() {

  HomePage homePage;
  ProductPage productsPage;
  ProductDetailPage productDetailPage;
  CartPage cartPage;
    
@Test
@Order(2)
public void search_product(){
  homePage = new HomePage(driver);
  productsPage = new ProductsPage(driver);
  homePage.search().search("ceket");
    Assertions.assertTrue(productsPage.isOnProductPage(),"Not found the god dang product !");
     
}
  }
@Test
@Order(3)
  public void select_a_product(){
    productsDetailPage = new ProductDetailPage(driver);
    productsPage.selectProduct(1);
    Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"I'm Sorry Master, I'm Afraid I Can't Do That ! I can't find the page... "
    
  }
@Test
@Order(3)
  public void add_product_to_cart(){
    productDetailPage.addToCart();
    Assertion.assertTrue(homePage.isProductCountup(),"Product count not increase")
    
  }

@Test
@Order(4)
public void go_to_cart(){
  cartPage = new CartPage(driver);
  homePage.goToCart();
  Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product was not added to cart!");
  
  
  
}
  
}


