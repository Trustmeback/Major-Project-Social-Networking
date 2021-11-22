package mainCode_E_learning;



import java.util.concurrent.TimeUnit;

import e_learningPageObjects.E_learningLogin;
import e_learningPageObjects.Groups;
import e_learningPageObjects.MyFriends;
import e_learningPageObjects.MyProfile;
import e_learningPageObjects.SkillSet;
import e_learningPageObjects.SocialNetworking;
import e_learningPageObjects.SocialWall;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import resources_E_learning.Base;


public class MainCode_E_learning<Socialnetworking, SocialWallPosting> extends Base {


@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
driver = initializeDriver();

}



@Given("^Navigate to \"([^\"]*)\"$")
public void navigate_to_something(String url) throws Throwable {
driver.get(url);
driver.manage().window().maximize();
}



@When("^User enters (.+) and (.+) and login$")
public void user_enters_and_and_login(String username, String password) throws Throwable {
E_learningLogin El= new E_learningLogin(driver);

El.getAccount().sendKeys(username);
El.getPassword().sendKeys(password);
El.getNext().click();
System.out.println("Login failed due to incorrect details");


}



@Then("^Verify that login is succesful completed$")
public void verify_that_login_is_succesful_completed() throws Throwable {

}



@Then("^close the window$")
public void close_the_window() throws Throwable {
	driver.quit();
}


//Sign in

@When("^User click on signup new page should open$")
public void user_click_on_signup_new_page_should_open() throws Throwable {
E_learningLogin El1= new E_learningLogin(driver);
El1.getSignin().click();
El1.getOption1().click();

}

@When("^User should be able to enter (.+), (.+), (.+), (.+), (.+), (.+), (.+)$")
public void user_shoul_be_able_to_enter_(String firstname, String lastname, String email, String username, String newpassword, String confirmpassword, String phonenumber) throws Throwable {

// code to follow the course

E_learningLogin El1= new E_learningLogin(driver);
El1.getFistname().sendKeys(firstname);
El1.getLastname().sendKeys(lastname);
El1.getEmail().sendKeys(email);
El1.getUsername().sendKeys(username);
El1.getNewPassword().sendKeys(newpassword);
El1.getConfirmPassword().sendKeys(confirmpassword);
El1.getPhonenumber().sendKeys(phonenumber);
El1.getLanguage().click();
El1.getSelectLanguage().click();
El1.getRegister().click();
System.out.println("Follow course registration done!");




// code to teach the course

El1.getOption2().click();
El1.getFirstname_1().sendKeys(firstname);
El1.getLastname_1().sendKeys(lastname);
El1.getEmail_1().sendKeys(email);
El1.getUsername_1().sendKeys(username);
El1.getNewPassword_1().sendKeys(newpassword);
El1.getConfirmPassword_1().sendKeys(confirmpassword);
El1.getPhonenumber_1().sendKeys(phonenumber);
El1.getLanguage_1().click();
El1.getSelectLanguage_1().click();
El1.getRegister_1().click();
El1.getHomePage().click();
System.out.println("Teach course registration done!");


//Login with valid details

El1.getAccount().sendKeys(username);
El1.getPassword().sendKeys(newpassword);
El1.getNext().click();
System.out.println("Login done succesfully");
}


@Then("^User should be able to complete regsistration$")
public void user_should_be_able_to_complete_regsistration() throws Throwable {

}

//Social networking 

@Given("^Start the browser with chrome$")
public void start_the_browser_with_chrome() throws Throwable {
	// initializes the driver
	driver = initializeDriver();
	// opens the link using the driver 
	driver.get("http://elearningm1.upskills.in/index.php");
	// wait for 10 seconds
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// maximizes the screen 
	driver.manage().window().maximize();
}

@When("^enter credentials (.+) and (.+) and login$")
public void enter_credentials_and_and_login(String username, String password) throws Throwable {
// create instance for social networking 
	SocialNetworking S1= new SocialNetworking(driver);
// giving username and password
	S1.getAccount().sendKeys(username);
	S1.getPassword().sendKeys(password);
//click on next to continue 
	S1.getNext().click();
}

@And("^goto to \"([^\"]*)\"$")
public void goto_to_something(String strArg1) throws Throwable {
   
}



@Given("^My courses page will be present$")
public void my_courses_page_will_be_present() throws Throwable {
    
}

@When("^User clicks on socialnetwork$")
public void user_clicks_on_socialnetwork() throws Throwable {
// create instance for social networking	
	SocialNetworking Sn = new SocialNetworking(driver);
// clicking on social network module 
	Sn.getSocnet().click();
// actual url to compare 
	String actualUrl="http://elearningm1.upskills.in/main/social/home.php";
// expected url which is driven by driver
    String expectedUrl= driver.getCurrentUrl();
// Comparing the expected url with actual url
    Assert.assertEquals(expectedUrl,actualUrl);
    
}


@Then("^Social Networking page will be opened$")
public void social_networking_page_will_be_opened() throws Throwable {
}


//Social Wall

@When("User enters text in the textbox")
public void user_enters_text_in_the_textbox() throws Throwable {
// create instance for social networking	
	 SocialWall s1 = new SocialWall(driver);
// passing information
	   s1.getText().sendKeys("testing is being done");
}

@And("clicks on the post button")
public void clicks_on_the_post_button() throws Throwable {
// create instance for SocialWall	
	SocialWall p1 = new SocialWall(driver);
// clicking on post
	   p1.getPost().click();
}


@And("then the text will get posted")
public void then_the_text_will_get_posted() throws Throwable {
   
}

@Then("^close the tab$")
public void close_the_tab() throws Throwable {
// closes the browser
   driver.close();
}


//My friends

@When("^user searches name of a person in the search box$")
public void user_searches_name_of_a_person_in_the_search_box() throws Throwable {
// create instance for MyFriends
	MyFriends f1 = new MyFriends(driver);
// passing information
	f1.getBox().sendKeys("Deekshith Saganti");
}

@When("^user to sends invitation to a person given down in the list by clicking on invitation$")
public void user_to_sends_invitation_to_a_person_given_down_in_the_list_by_clicking_on_invitation() throws Throwable {
// create instance for MyFriends	
	MyFriends i1 = new MyFriends(driver);
// click on invite 
	i1.getInvite().click();
}

@Then("^list of names are displayed$")
public void list_of_names_are_displayed() throws Throwable {
   
}

@Then("^the invite is sent $")
public void the_invite_is_sent() throws Throwable {
   
}

@And("^hits search key$")
public void hits_search_key() throws Throwable {
// create instance for MyFriends	
	MyFriends h1 = new MyFriends(driver);
// click on search 
	h1.getSearch().click();
}

@And("^the sendmessage box has to be hit$")
public void the_sendmessage_box_has_to_be_hit() throws Throwable {
// create instance for MyFriends
	MyFriends sm1 = new MyFriends(driver);
// click on send message 
	sm1.getSendmess().click();
}

@And("^the message has to be written$")
public void the_message_has_to_be_written() throws Throwable {
// create instance for MyFriends
	MyFriends mes1 = new MyFriends(driver);
// passing information
	mes1.getMessage().sendKeys("Automate testing a website");
}
@Then("^close the windows$")
public void close_the_windows() throws Throwable {
// close the window 
   driver.close();
}

//skill set

@When("^user clicks on dropdown button and selects skill report$")
public void user_clicks_on_dropdown_button_and_selects_skill_report() throws Throwable {
// create instance for SkillSet	
	SkillSet dd = new SkillSet(driver);
// click on dropdown 
	dd.getDropdown().click();
// create instance for SkillSet	
	SkillSet sk1 = new SkillSet(driver);
// click on send report 
	sk1.getSkirep().click();
// navigate back 
	driver.navigate().back();
// click on dropdown
	dd.getDropdown().click();
}


@And("^clicks on skill wheel,Get new skill,Display options$")
public void clicks_on_skill_wheelget_new_skilldisplay_options() throws Throwable {
// create instance for SkillSet		
	SkillSet sw = new SkillSet(driver);
// click on skill wheel 
	sw.getSkiwhe().click();
// create instance for SkillSet	
	SkillSet nsk = new SkillSet(driver);
// click on new skill 
	nsk.getNewski().click();
// create instance for SkillSet	
	SkillSet dso = new SkillSet(driver);
// click on display options
	dso.getDisop().click();
}


@Then("^changes the color$")
public void changes_the_color() throws Throwable {
// create instance for SkillSet	
	SkillSet sc = new SkillSet(driver);
// click on white 	
	sc.getWhite().click();
// click on Black 	
	sc.getBlack().click();
// click on Light blue 
	sc.getLiblu().click();
// click on Gray 
    sc.getGray().click();
// click on Corn
	sc.getCorn().click();
// navigating back 	
	driver.navigate().back();
// create instance for SkillSet		
	SkillSet dd = new SkillSet(driver);
// click on dropdown
	dd.getDropdown().click();
}

@Then("^clicks on Your skill ranking$")
public void clicks_on_your_skill_ranking() throws Throwable {
// create instance for SkillSet		
	SkillSet sr = new SkillSet(driver);
// click on skill rank 
	sr.getSkira().click();
// navigating back 	
	driver.navigate().back();
}



//my profile

@When("^User clicks on profile and edit profile$")
public void user_clicks_on_profile_and_edit_profile() throws Throwable {
// create instance for MyProfile
	MyProfile ed1 = new MyProfile(driver);
// click on edit profile 
	ed1.getEditprof().click();
}

@Then("^enters credentials and saves$")
public void enters_credentials_and_saves() throws Throwable {
// create instance for MyProfile
	MyProfile cre1 = new MyProfile(driver);
// passing information
	cre1.getPass().sendKeys("pavan12!@34#$");
// passing information
	cre1.getNewpass().sendKeys("pavan12!@34#$");
// passing information
	cre1.getConfirm().sendKeys("pavan12!@34#$");
// create instance for MyProfile
	MyProfile svsa1 = new MyProfile(driver);
// clicks on save 
	svsa1.getSavse().click();
// navigate back 
	driver.navigate().back();
	driver.navigate().back();
// closes the window
	driver.close();
}


//groups 

@When("^user clicks on the social groups and selects groups$")
public void user_clicks_on_the_social_groups_and_selects_groups() throws Throwable {
// create instance for Groups	
	Groups gr = new Groups(driver);
// clicks on my groups 
	gr.getGroup().click();
// create instance for Groups
	Groups nw = new Groups(driver);
// clicks on popular 
	nw.getPopular().click();
}

@Then("^user clicks on one of the groups$")
public void user_clicks_on_one_of_the_groups() throws Throwable {
// create instance for Groups
	Groups c1 = new Groups(driver);
// click on one group to become a member
	c1.getClick1().click();
	driver.close();
}

}



