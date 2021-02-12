package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Work
  {
	public WebDriver driver;
	
	@FindBy(xpath="//a[.='HR Manager']/../..//a[contains(text(),'delete')]")
	private WebElement deleteHRmanager;
	
	public Delete_Work(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void deleteHRManagerMethod() throws InterruptedException
	{
		deleteHRmanager.click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", deleteHRmanager);*/
	}
	
}
