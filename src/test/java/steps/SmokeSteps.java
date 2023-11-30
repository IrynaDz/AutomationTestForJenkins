package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {
    @Given("I print Hello Word")
    public void i_print_hello_word() {
        System.out.println("Hello Word!");
    }

    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy!");
    }

    @Given("I run cucumber test")
    public void i_run_cucumber_test() {
        for(int i = 0; i < 100; i ++ ){
            System.out.println("This is Cucumber Test!!!");
        }
    }

    @Then("verify this is Cucumber")
    public void verify_this_is_cucumber() {
        for(int i = 0; i < 20; i ++ ){
            System.out.println("Indeed this Test!!!");
        }
    }
}