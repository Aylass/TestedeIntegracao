package com.pmendonca;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class SomadorNumeroTest {
    Somador som;
    Numero num;
    Numero outro;

    @Test
   public void somaTest1(){

       num=new Numero(4);
       outro=new Numero(-4);
       som=new Somador();
       som.set(num);
       som.mais(outro);
       assertEquals(8,som.resultado().valor());
   }

    @Test
    public void somaTest2(){
        num=new Numero(-4);
        outro=new Numero(3);
        som=new Somador();
        som.set(num);
        som.mais(outro);
        assertEquals(-1,som.resultado().valor());
    }

    @Test
    public void somaTest3(){
        num=new Numero(378);
        outro=new Numero(4568);
        som=new Somador();
        som.set(num);
        som.mais(outro);
        assertEquals(4946,som.resultado().valor());
    }

    @Test
    public void subTest1(){
        num=new Numero(4);
        outro=new Numero(-4);
        som=new Somador();
        som.set(num);
        som.menos(outro);
        assertEquals(0,som.resultado().valor());
    }

    @Test
    public void subTest2(){
        num=new Numero(-4);
        outro=new Numero(3);
        som=new Somador();
        som.set(num);
        som.menos(outro);
        assertEquals(-7,som.resultado().valor());
    }

    @Test
    public void subTest3(){
        num=new Numero(378);
        outro=new Numero(4568);
        som=new Somador();
        som.set(num);
        som.menos(outro);
        assertEquals(-4190,som.resultado().valor());
    }




}
