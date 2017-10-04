package FrenzyDashboard;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_Video extends Servicios_Frenzy {
	@Test(description="Test Video in Home", priority=4)
	public void Video()throws InterruptedException{
		try {
	        driver.findElement(By.xpath("//*[@id=\"Benefits\"]/div[1]/img")).click();
		    String video1 = "//*[@id=\"Benefits\"]/div[2]/div[2]/p/img";
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(video1)).click();
		    driver.navigate().refresh();
		    Thread.sleep(200);
		}catch(Exception e) {
            e.printStackTrace();
            Assert.fail("hoverServices method failed in ServicesFrenzy " + e.getMessage());
		}
	}

}
