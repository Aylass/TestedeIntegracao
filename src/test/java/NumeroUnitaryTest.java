
import org.junit.Test;

import static org.junit.Assert.*;


public class NumeroUnitaryTest {

    Numero numD;

    @Test
    public void testInc1(){
        Numero num=new Numero(300);
        num.inc();
        assertEquals(301,num.valor());
    }

    @Test
    public void testInc2(){
        Numero num=new Numero(-50);
        num.inc();
        assertEquals(-49,num.valor());
    }

    @Test
    public void testDec1(){
        Numero num=new Numero(300);
        num.dec();
        assertEquals(299,num.valor());
    }

    @Test
    public void testDec2(){
        Numero num=new Numero(-50);
        num.dec();
        assertEquals(-51,num.valor());
    }
}
