import com.pmendonca.Fatorial;
import com.pmendonca.Multiplicador;
import com.pmendonca.Numero;
import com.pmendonca.Somador;
import org.junit.Test;

import static org.junit.Assert.*;

public class FatorialTest {
    Numero num;
    Somador som;
    Multiplicador multi;
    Fatorial fat;

    @Test
    public void fatorial() {
    num=new Numero(-1);
    som=new Somador();
    som.set(num);
    multi=new Multiplicador(som);
    fat=new Fatorial(multi);
    fat.fatorial(fat.resultado());
    assertEquals(null,fat.resultado());
    }

    @Test
    public void fatorial2() {
        num=new Numero(0);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        fat=new Fatorial(multi);
        fat.fatorial(fat.resultado());
        assertEquals(1,fat.resultado().valor());
    }

    @Test
    public void fatorial3() {
        num=new Numero(8);
        som=new Somador();
        som.set(num);
        multi=new Multiplicador(som);
        fat=new Fatorial(multi);
        fat.fatorial(fat.resultado());
        assertEquals(40320,fat.resultado().valor());
    }
}
