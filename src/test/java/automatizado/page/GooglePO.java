package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Construtor para criação para a página do Google
     * @param dirver Driver da página do Google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
        
    }

    /**
     * Metodo que irá efetuar uma pesquisa no Google baseando no texto no informando e concluíndo com entener
     * @param texto Texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Método que retorna o resultado aproximado da pesquisa
     * @return Retorna o resultado na pesquisa.
     */
    public String resultadoDaPesquisa(){
        return divResultadoPesquisa.getText();
    }
    
}
