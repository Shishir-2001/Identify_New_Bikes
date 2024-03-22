package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignupPage extends BasePage{
	public LoginSignupPage(WebDriver driver) {
		super(driver);
	}

	//Zigwheels link
	@FindBy(xpath="//*[@class='zw i-b mt-3 zw-logo-a zw-srch-logo' or @title='ZigWheels']")
	public WebElement zigwheels;
	
	//Login/SignUp Button Element
//	@FindBy(xpath = "//div[@id='des_lIcon']") //   "//div[@id='forum_login_div_lg']"
	
	@FindBy(xpath = "//div[@id='forum_login_div_lg']")
	public WebElement loginSignUpButton;
	
	//Login with google Button
	@FindBy(xpath="//div[@class='lgn-sc c-p txt-l pl-30 pr-30 googleSignIn']")
	public WebElement loginWithGoogleButton;
	
	//Click on Zigwheels
	public void clickZigwheels() {
		zigwheels.click();
	}
	
	//Click on Login/SignUp button 
	public void clickLoginSignUp() {
		loginSignUpButton.click();
	}
	
	//Click on Sign in with Google
	public void selectGoogleButton() {
		loginWithGoogleButton.click();
	}
	
}
