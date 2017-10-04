package FrenzyDashboard;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Navbar extends OpenBrowser {
	
	@Test(testName="Botones de Navegación",description="Prueba de botones de navegación",priority=2)
	public void Navegacion() throws InterruptedException {
	    try {
	    	//Ir a la ruta
			driver.get(FrenzyDash);
	    	 // Variables de automatización de navegación
		    String Servicios = "(//P[@href='#Services'][text()='SERVICIOS'][text()='SERVICIOS'])[1]";
		    String Beneficios = "(//P[@href='#Benefits'][text()='BENEFICIOS'][text()='BENEFICIOS'])[1]";
		    String Contacto = "(//P[@href='#contactUs'][text()='CONTACTO'][text()='CONTACTO'])[1]";
		    String Login = "(//P[@class='buttonMenu'][text()='INICIAR SESIÓN'][text()='INICIAR SESIÓN'])[1]";
		    String Registro = "(//DIV[@class='selectTabLogin'])[2]";
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(Servicios)).click();
		    System.out.println("Click en Servicios");
		    driver.findElement(By.xpath(Beneficios)).click();
		    System.out.println("Click en Beneficios");
		    driver.findElement(By.xpath(Contacto)).click();
		    System.out.println("Click en Contacto");
		    driver.findElement(By.xpath(Login)).click();
		    System.out.println("Click en Login");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(Registro)).click();
		    Thread.sleep(2500);
		    System.out.println("Click en Registro");
		    driver.navigate().refresh();
		    System.out.println("Vista principal");
	    	
	    }catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Method Failed in Navbar " + e.getMessage());
        }
	}
}
