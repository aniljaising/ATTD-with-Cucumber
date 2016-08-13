package operations;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import operations.ATMCalculator;

public class steps {

	private ATMCalculator calc;
	
	@Given("^I have (\\d+) in my account$")
	public void iHaveInMyAccount(int amount1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calc = new ATMCalculator();
		calc.setCurrentBalance(amount1);
	   // throw new PendingException();
	}

	@When("^I request (\\d+)$")
	public void iRequest(int amount2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		calc.withdraw(amount2);
	    //throw new PendingException();
	}

	@Then("^(\\d+) should remain$")
	public void shouldRemain(int total) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(total,  calc.getCurrentBalance());
//	    throw new PendingException();
	}
}
