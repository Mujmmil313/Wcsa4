package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
  @FindBy (xpath = "//div[@class='label' and (.='User')]") private WebElement userTab;
  @FindBy (xpath = "create user x path") private WebElement createUser;
  @FindBy (name ="username") private WebElement usnTextBox;
  @FindBy (name ="passwordTextRetype") private WebElement reTypeTextBox;
  @FindBy (name ="firstName") private WebElement firstNameTextBox;
  @FindBy (name ="lastName") private WebElement lastNameBox;
  @FindBy (xpath ="//input[@type='submit']") private WebElement createUserButton;
  @FindBy (xpath ="//input[@value='      Cancel      ']") private WebElement cancelButton;
  
 // initialization
public UserPage(WebElement driver) {
	
	PageFactory.initElements(driver, this);
	
}

public WebElement getUserTab() {
	return userTab;
}

public WebElement getCreateUser() {
	return createUser;
}

public WebElement getUsnTextBox() {
	return usnTextBox;
}

public WebElement getReTypeTextBox() {
	return reTypeTextBox;
}

public WebElement getFirstNameTextBox() {
	return firstNameTextBox;
}

public WebElement getLastNameBox() {
	return lastNameBox;
}

public WebElement getCreateUserButton() {
	return createUserButton;
}

public WebElement getCancelButton() {
	return cancelButton;
}
//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
//Operational Method
public void setUserTab(WebElement userTab) {
	this.userTab = userTab;
}

public void setCreateUser(WebElement createUser) {
	this.createUser = createUser;
}

public void setUsnTextBox(WebElement usnTextBox) {
	this.usnTextBox = usnTextBox;
}

public void setReTypeTextBox(WebElement reTypeTextBox) {
	this.reTypeTextBox = reTypeTextBox;
}

public void setFirstNameTextBox(WebElement firstNameTextBox) {
	this.firstNameTextBox = firstNameTextBox;
}

public void setLastNameBox(WebElement lastNameBox) {
	this.lastNameBox = lastNameBox;
}

public void setCreateUserButton(WebElement createUserButton) {
	this.createUserButton = createUserButton;
}

public void setCancelButton(WebElement cancelButton) {
	this.cancelButton = cancelButton;
}

public void clickOnTab() {
	createUser.click();
}

public void retypePass() {
	
}






  
  
  
  
}
