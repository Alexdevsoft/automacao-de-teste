package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest{

      private static LoginPO loginPage;

     
    @BeforeClass
    public static void prepararTest(){
        loginPage = new LoginPO(driver);
    }
    

    @Test
    public void TC001_naoDeveLogarComUsuarioSenhaVazios(){

        loginPage.executarAcaoDeLogoar("", "");
        String mensagem = loginPage.spanMensagem.getText();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
        
    }

    @Test
    public void TC002_naoDeveLogarComEmailIncorretoESenhaVazia(){

       loginPage.executarAcaoDeLogoar("teste", "");
        String mensagem = loginPage.spanMensagem.getText();
        
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
        
    }

    @Test
    public void TC003_naoDeveLogarSistemaComEmailVazioESenhaIncorreta(){

        loginPage.executarAcaoDeLogoar("", "teste");
        String mensagem = loginPage.spanMensagem.getText();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
        
    }

     @Test
    public void TC007_deveLogarNoSistemaComEmailESenhaCorretos(){

        loginPage.executarAcaoDeLogoar("admin@admin.com", "admin@123");

        assertEquals( loginPage.tituloDaPagina(), "Controle de Produtoss");
        
    }
       
}
