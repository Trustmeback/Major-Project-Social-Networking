package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class E_learningLogin {

public WebDriver driver;

// Login with wrong credentials
By user = By.cssSelector("[placeholder='Username']");
By password = By.cssSelector("[placeholder='Pass']");
By next = By.name("submitAuth");

// sign in with new details for follow courses
By signin=By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a");
By option1 = By.xpath("//*[@value='5']");
By firstname = By.id("registration_firstname");
By lastname = By.id("registration_lastname");
By email = By.cssSelector("input#registration_email");
By username = By.xpath("//*[@id='username']");
By newpassword = By.xpath("//*[@id='pass1']");
By confirmpassword = By.id("pass2");
By phonenumber = By.id("registration_phone");
By language = By.className("filter-option-inner");
By selectlanguage = By.linkText("English");
By registerbtn = By.xpath("//*[@name='submit'][@id='registration_submit']");
By homepage = By.xpath("//*[@id='navbar']/ul[1]/li[1]/a");


// sign in for Teach courses
By signin_1=By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a");
By option_2 = By.xpath("//*[@value='1']");
By firstname_1 = By.id("registration_firstname");
By lastname_1 = By.id("registration_lastname");
By email_1 = By.cssSelector("input#registration_email");
By username_1 = By.xpath("//*[@id='username']");
By newpassword_1 = By.xpath("//*[@id='pass1']");
By confirmpassword_1 = By.id("pass2");
By phonenumber_1 = By.id("registration_phone");
By language_1 = By.className("filter-option-inner");
By selectlanguage_1 = By.linkText("English");
By registerbtn_1 = By.xpath("//*[@name='submit'][@id='registration_submit']");



public E_learningLogin (WebDriver driver) {
this.driver= driver;
}

public WebElement getAccount() {
return driver.findElement(user);

}
public WebElement getPassword() {
return driver.findElement(password);
}
public WebElement getNext() {
return driver.findElement(next);

}


// Follow course
public WebElement getSignin() {
return driver.findElement(signin);
}
public WebElement getOption1() {
return driver.findElement(option1);
}
public WebElement getFistname() {
return driver.findElement(firstname);
}
public WebElement getLastname() {
return driver.findElement(lastname);
}
public WebElement getEmail() {
return driver.findElement(email);
}
public WebElement getUsername() {
return driver.findElement(username);
}
public WebElement getNewPassword() {
return driver.findElement(newpassword);
}
public WebElement getConfirmPassword() {
return driver.findElement(confirmpassword);
}
public WebElement getPhonenumber() {
return driver.findElement(phonenumber);
}
public WebElement getLanguage() {
return driver.findElement(language);
}
public WebElement getSelectLanguage() {
return driver.findElement(selectlanguage);
}
public WebElement getRegister() {
return driver.findElement(registerbtn);
}

// Teach course
public WebElement getOption2() {
return driver.findElement(option_2);
}
public WebElement getFirstname_1() {
return driver.findElement(firstname_1);
}
public WebElement getLastname_1() {
return driver.findElement(lastname_1);
}
public WebElement getEmail_1() {
return driver.findElement(email_1);
}
public WebElement getUsername_1() {
return driver.findElement(username_1);
}
public WebElement getNewPassword_1() {
return driver.findElement(newpassword_1);
}
public WebElement getConfirmPassword_1() {
return driver.findElement(confirmpassword_1);
}
public WebElement getPhonenumber_1() {
return driver.findElement(phonenumber_1);
}
public WebElement getLanguage_1() {
return driver.findElement(language_1);
}
public WebElement getSelectLanguage_1() {
return driver.findElement(selectlanguage_1);
}
public WebElement getRegister_1() {
return driver.findElement(registerbtn_1);
}

public WebElement getHomePage() {
return driver.findElement(homepage);
}


public WebElement getLogin1() {
return driver.findElement(user);
}
public WebElement getLogin2() {
return driver.findElement(password);
}
public WebElement getLogin3() {
return driver.findElement(next);
}
}