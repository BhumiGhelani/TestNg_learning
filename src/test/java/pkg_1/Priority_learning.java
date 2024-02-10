package pkg_1;

import org.testng.annotations.Test;

public class Priority_learning {

    @Test(priority =0)
    public void tc_001(){
        System.out.println("This is Priority 0");
    }
    @Test(priority = 1)
    public void tc_002(){
        System.out.println("This is Priority 1");
    }
    @Test(priority = 2)
    public void tc_003(){
        System.out.println("This is Priority 2");
    }
    @Test(priority = 0)
    public void tc_004(){
        System.out.println("This is Priority 0");
    }
    @Test(priority = 1)
    public void tc_005(){
        System.out.println("This is Priority 1");
    }
    @Test(priority = 2)
    public void tc_006(){
        System.out.println("This is Priority 2");
    }
    @Test(priority = 0)
    public void tc_007(){
        System.out.println("This is Priority 0");
    }
    @Test(priority = 1)
    public void tc_008(){
        System.out.println("This is Priority 1");
    }
    @Test(priority = 2)
    public void tc_009(){
        System.out.println("This is Priority 2");
    }
    @Test(priority = 3)
    public void tc_010(){
        System.out.println("This is Priority 3");
    }
}
