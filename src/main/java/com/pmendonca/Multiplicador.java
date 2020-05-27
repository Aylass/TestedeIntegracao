package com.pmendonca;

public class Multiplicador {
    private Somador resultado;

    public Multiplicador(Somador somador){
        this.resultado = somador;
    }

    public Multiplicador set(Numero valor){
        this.resultado = this.resultado.set(valor);
        return this;
    }

    public Multiplicador vezes(Numero outro){
        if(resultado.resultado().valor()==0 || outro.valor()==0){
            //se qualquer um dos numeros, ou até mesmo os dois numeros, forem 0, o resultado é 0.
            resultado.set(new Numero(0));
        }
        else if((resultado.resultado().valor()<0 && outro.valor()<0) || (resultado.resultado().valor()>=0 && outro.valor()>=0)){
            //os dois sao negativos ou os 2 sao positivos, por tanto o resultado do produto é positivo.
            //transforma o resultado atual e a variavel outro em positivos (caso ainda nao sejam)
            outro=outro.abs();
            this.resultado = this.resultado.set(this.resultado.resultado().abs());
            //multiplica
            Numero res = new Numero(resultado.resultado().valor());
            while(outro.valor()>1){
                resultado.mais(res);
                outro.dec();
            }
        }
        else if(resultado.resultado().valor()>=0){
            //o outro é negativo, e o atual é positivo, vai dar negativo.
            //transforma resultado em negativo e outro em positivo, pra dar negativo.
            this.resultado=this.resultado.set(new Numero(-this.resultado.resultado().valor()));
            outro = outro.abs();
            //multiplica
            Numero res = new Numero(resultado.resultado().valor());
            while(outro.valor()>1){
                resultado.menos(res);
                outro.dec();
            }
        }
        else{
            //o resultado atual é negativo, e o outro positivo, é só multiplicar normal que dará negativo

            //multiplica
            Numero res = new Numero(resultado.resultado().valor());
            while(outro.valor()>1){
                resultado.menos(res);
                outro.dec();
            }
        }
        return this;
    }

    public Numero resultado(){
        return resultado.resultado();
    }
}