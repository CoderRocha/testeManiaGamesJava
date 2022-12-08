package testeSenaiCursos;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginSite {
	private WebDriver driver;
	
	@Before
	public void configurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador() {
		driver.get("https://http://localhost:4200/");
		
		driver.findElement(By.xpath(null)).click();
		
		
		WebElement campo_email =  driver.findElement(By.id("email"));
		WebElement campo_senha =  driver.findElement(By.id("senha"));
		WebElement botao_login =  driver.findElement(By.id("botao-enviar"));
		
		String[] listaEmails = {"name@example.com"};
		String[] listaSenhas = {"bestPassword123"};
		
		try {
			
			for(int contador = 0; contador < 3; contador++) {
				campo_email.clear();
				campo_senha.clear();
				
				campo_email.sendKeys(listaEmails[contador]);
				campo_senha.sendKeys(listaSenhas[contador]);
				botao_login.click();
				
				Thread.sleep(3000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
