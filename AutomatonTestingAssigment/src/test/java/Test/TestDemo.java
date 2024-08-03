package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	

		
						driver.manage().window().maximize();
					driver.get("https://www.fitpeo.com/");
					
				
						driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
						Thread.sleep(3000);
						JavascriptExecutor js = (JavascriptExecutor)driver;
						WebElement element = driver.findElement(By.xpath(" //h4[text()='Medicare Eligible Patients']"));
						js.executeScript("arguments[0].scrollIntoView()",element); 
						Thread.sleep(2000);
						String paitents = "560";
						driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
						

						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys(paitents);
						
						boolean check = driver.findElement(By.xpath("//input[@value="+paitents+"]")).isDisplayed();
						
						if(check==true) {
							System.out.println("Slider is set to : "+paitents);
						}
						else {
							System.out.println("Slider is not set to : "+paitents);

						}
						driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
						
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
                        Thread.sleep(2000);
						
						driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
						
						Thread.sleep(4000);
//						driver.quit();
//						Thread.sleep(4000);
						
						
	}

}
