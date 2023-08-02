package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.GooglePO;

public class GoogleTest extends BaseTest{


    //private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTest(){
       // driver.get("file:///C:/Users/alexs/Documents/sistema/login.html");
       // googlePage = new GooglePO(driver);
    }
    

    @Test
    public void TC001_devePesquisarNoGoogleBatataFrita(){

        //WebElement inputPesquisa = driver.findElement(By.name("q"));

        //googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);
       // googlePage.pesquisar("Batata frita");

        //String resultado = googlePage.resultadoDaPesquisa();

       // assertTrue(resultado, resultado.contains("Aproximadamente"));
                
    }
    
    @Test
    public void TC002_devePesquisarNoGooglePizza(){

        //WebElement inputPesquisa = driver.findElement(By.name("q"));

       // googlePage.pesquisar("Pizza");

       // String resultado = googlePage.resultadoDaPesquisa();

       // assertTrue(resultado, resultado.contains("resultados"));
                
    }
}