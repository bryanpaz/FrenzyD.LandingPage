package FrenzyDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	public String FrenzyDash = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
	static WebDriver driver;
	@Test(description="Abre el navegador configurado", priority=1)
  public void AbrirNavegador() {
		//Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/test/fr/chromedriver.exe");
		//Abrir el navegador
		driver = new ChromeDriver();
	
  }
}
