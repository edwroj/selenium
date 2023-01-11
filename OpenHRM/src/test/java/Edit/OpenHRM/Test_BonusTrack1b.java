package Edit.OpenHRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_BonusTrack1b {
	
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	public void validarFormulario() {
		
		WebDriver navegador = new ChromeDriver();
		navegador.get(url);
		navegador.manage().window().maximize();
		
		WebElement txtuser = navegador.findElement(By.name("username"));
		WebElement txtclave = navegador.findElement(By.name("password"));
		txtuser.click();
		txtuser.sendKeys("Admin");
		txtclave.sendKeys("admin123");
		
		
		
	}

}
