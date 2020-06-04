import com.pmendonca.Multiplicador;
import com.pmendonca.Numero;
import com.pmendonca.Somador;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


public class SomaMultiplicadorTest {
    Somador som;
    Numero num;
    Numero outro;
    Multiplicador multi;

    @Test
    public void vezes1() {
        num=new Numero(-4);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(-4);
        multi.vezes(outro);
        assertEquals(16,multi.resultado().valor());
    }

    @Test
    public void vezes2() {
        num=new Numero(-4);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(3);
        multi.vezes(outro);
        assertEquals(-12,multi.resultado().valor());
    }

    @Test
    public void vezes3() {
        num=new Numero(378);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(4568);
        multi.vezes(outro);
        assertEquals(1726704,multi.resultado().valor());
    }

    @Test
    public void vezes4() {
        num=new Numero(0);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(-378);
        multi.vezes(outro);
        assertEquals(0,multi.resultado().valor());
    }

    @Test
    public void dividido1() {
        num=new Numero(4);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(0);
        multi.dividido(outro);
        assertEquals(null,multi.resultado());
    }

    @Test
    public void dividido2() {
        num=new Numero(-4);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(-4);
        multi.dividido(outro);
        assertEquals(1,multi.resultado().valor());
    }

    @Test
    public void dividido3() {
        num=new Numero(-4);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(3);
        multi.dividido(outro);
        assertEquals(-1,multi.resultado().valor());
    }

    @Test
    public void dividido4() {
        num=new Numero(378);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(4568);
        multi.dividido(outro);
        assertEquals(0,multi.resultado().valor());
    }

    @Test
    public void dividido5() {
        num=new Numero(0);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(-378);
        multi.dividido(outro);
        assertEquals(0,multi.resultado().valor());
    }

    @Test
    public void dividido6() {
        num=new Numero(4568);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        outro=new Numero(2);
        multi.dividido(outro);
        assertEquals(2284,multi.resultado().valor());
    }

}
