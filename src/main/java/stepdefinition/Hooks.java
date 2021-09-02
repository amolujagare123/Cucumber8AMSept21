package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@invalid")
    public void beforeMyScenario()
    {
        System.out.println("inside beforeMyScenario");
    }

    @After ("@invalid")
    public void afterMyScenario()
    {
        System.out.println("inside afterMyScenario");
    }
}
