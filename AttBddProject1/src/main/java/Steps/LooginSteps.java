package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LooginSteps {
	
	@Given("User at the login screen")
	public void Precondition()
	{
		System.out.println("thats preconditin");
	}
	
	@When("user Enter username")
	public void EnterUsername()
	{
		System.out.println("enter the valid user name");
		
	}
	
	@When(" user enter Password")
	public void EnterPassword()
	{
		System.out.println("ente valid password");
	}
	
	@When("user click on login button")
	public void ClickLogginBtn()
	{
		System.out.println("click login button");
	}
	
	@Then("user should be looged")
	public void LoginSucsess()
	{
		System.out.println("Login sucseessful");
	}

}
