package controllertest;

import at.technikum.maintenancemonitor.MonitorController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class ControllerTest {
    MonitorController  controller=new MonitorController();

    @BeforeEach
    public void controllerInit(){//Initialize Controller before each run!
        controller =new MonitorController();
    }


    @Test //this Test gets the variable and compares it
    public void testGetStatus(){
        controller.setStatus("-"); // Reset the RestAPI message

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

    @Test //This Test sets the Status and tests the setMethod
    public void testSetStatus(){
        controller.setStatus("test");

        String s = controller.getStatus();//actual
        String excepted = "test";//excepted

        Assert.assertEquals("Should be \"Test\" ",excepted,s);

    }

    @Test //This Test sets the Status with Null Value and tests the setMethod
    public void testSetStatusNull(){
        controller.setStatus(null);

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

    @Test //This Test sets the Status with Blank Value and tests the setMethod
    public void testSetStatusBlank(){
        controller.setStatus("");

        String s = controller.getStatus();//actual
        String excepted = "-";//excepted

        Assert.assertEquals("Should be \"-\" ",excepted,s);
    }

}

