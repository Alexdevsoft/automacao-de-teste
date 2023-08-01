package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.LoginPO;

public class LoginTest extends BaseTest{

      private static LoginPO loginPage;

    @BeforeClass
    public static void prepararTest(){
        loginPage = new LoginPO(driver);
    }
    

    @Test
    public void TC001_naoDeveLogarComUsuarioSenhaVazios(){

        loginPage.inputEmail.sendKeys("");
        loginPage.inputSenha.sendKeys("");
        
        loginPage.buttonEntar.click();
        
        String mensagem = loginPage.spanMensagem.getText();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
                
    }
    
}
