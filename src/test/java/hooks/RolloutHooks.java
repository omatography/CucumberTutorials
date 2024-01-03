package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RolloutHooks {

    @Before("@Regression")
    public void setupRegression(){
        System.out.println("Setting up the Regression suite");
    }

    @Before
    public void setupBrowser(){
        System.out.println("Setting up the browser and driver");
    }

    @After
    public void tearDown(){
        System.out.println("Closing the browser and driver");
    }

}
