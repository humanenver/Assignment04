import org.junit.Assert;

import static junit.framework.TestCase.assertSame;

public class Test{



    Color color = new Color("red",true);
    Main main = new Main();

    String[] colors = {"red", "red",};


    @org.junit.Test
    public void testGetColor() {



        assertSame("red",color.getColor());


    }


    @org.junit.Test
    public void testPrimaryColor() {

        assertSame(true,color.isPrimaryColor());

    }








}
