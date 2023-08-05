package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "C:/Users/alexs/Documents/sistema/login.html";
    //private final String CAMINHO_DRIVE = "C:/Users/alexs/OneDrive/Documents/Automatizado/automatizado/src/test/java/automatizado/resource";

    @BeforeClass
     public static void iniciar(){
        System.setProperty("webdriver.chrome.driver","src/test/java/automatizado/resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        //driver.quit();
    }
    
}
