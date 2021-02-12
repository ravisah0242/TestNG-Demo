package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeofWork 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='popup_menu_container'])[2]")
	private WebElement PopupMenuContainerlink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofWorklink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement  createtypeofworklink;
	
	@FindBy(id="name")
	private WebElement namecreatetypeofwork;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitlink;
	
	
	public TypeofWork(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void popupmenuMethod() throws InterruptedException
	{
		Thread.sleep(5000);
		PopupMenuContainerlink.click();
	}
	public void typeofworkMethod()
	{
		typeofWorklink.click();
	}
	public void createtypeofworkMethod()
	{
		createtypeofworklink.click();
	}
	public void namecreatetypeofworkMethod()
	{
		namecreatetypeofwork.sendKeys("HR Manager");
	}
	public void submitMethod()
	{
		submitlink.click();
	}
	

}
