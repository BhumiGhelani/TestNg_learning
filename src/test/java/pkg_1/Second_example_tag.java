package pkg_1;

import org.testng.annotations.Test;

public class Second_example_tag {

    @Test(groups ={"Smoke"})
    public void tc_001(){
        System.out.println("This is Test case 001");
    }
    @Test(groups = {"Smoke"})
    public void tc_002(){
        System.out.println("This is Test case 002");
    }
    @Test(groups = {"Smoke"})
    public void tc_003(){
        System.out.println("This is Test case 003");
    }
    @Test(groups = {"Regression"})
    public void tc_004(){
        System.out.println("This is Test case 004");
    }
    @Test(groups = {"Regression"})
    public void tc_005(){
        System.out.println("This is Test case 005");
    }
    @Test(groups = {"Regression"})
    public void tc_006(){
        System.out.println("This is Test case 006");
    }
    @Test(groups = {"Regression"})
    public void tc_007(){
        System.out.println("This is Test case 007");
    }
    @Test(groups = {"endToend"})
    public void tc_008(){
        System.out.println("This is Test case 008");
    }
    @Test(groups = {"endToend"})
    public void tc_009(){
        System.out.println("This is Test case 009");
    }
    @Test(groups = {"endToend"})
    public void tc_010(){
        System.out.println("This is Test case 010");
    }
}
