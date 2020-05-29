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
        if(outro.valor()==0 || resultado.resultado().valor()==0){
            //se um dos dois for 0, a resposta é zero porque 0*n=0
            resultado = resultado.set(new Numero(0));
            return this;
        }
        //nas proximas 4 linhas descobre e armazena a informacao de valor positivo ou negativo dos numeros
        boolean resultadoPos = true;
        boolean outroPos = true;
        if(resultado.resultado().valor()<0)resultadoPos=false;
        if(outro.valor()<0)outroPos=false;

        //transforma os dois valores em positivo para multiplicar com o while
        resultado = resultado.set(resultado.resultado().abs());
        outro = outro.abs();

        //multiplica
        Numero res = new Numero(resultado.resultado().valor());
        while(outro.valor()>1){
            resultado.mais(res);
            outro.dec();
        }

        //se os sinais forem diferentes, o resultado era pra ser negativo, entao transforma em negativo
        if(resultadoPos!=outroPos){
            resultado = resultado.set(new Numero(-resultado.resultado().valor()));
        }
        return this;
    }

    public Multiplicador dividido(Numero outro){
        if(outro.valor()==0){
            //divisao por 0 é indefinido, operacao invalida.
            System.out.println("Divisao por 0, invalido!");
            resultado=resultado.set(null);
            return this;
        }
        if(resultado.resultado().valor()==0){
            //se o numero a ser divido for 0, o resultado é 0.
            resultado = resultado.set(new Numero(0));
            return this;
        }
        //nas proximas 4 linhas descobre e armazena a informacao de valor positivo ou negativo dos numeros
        boolean resultadoPos = true;
        boolean outroPos = true;
        if(resultado.resultado().valor()<0)resultadoPos=false;
        if(outro.valor()<0)outroPos=false;

        //transforma os dois valores em positivo para multiplicar com o while
        resultado = resultado.set(resultado.resultado().abs());
        outro = outro.abs();

        //divide
        Numero count = new Numero(0);
        Numero res = new Numero(resultado.resultado().valor());
        while(resultado.resultado().valor() >= outro.valor()){
            count.inc();
            resultado.menos(outro);
        }
        resultado.set(new Numero(count.valor()));

        //se os sinais forem diferentes, o resultado era pra ser negativo, entao transforma em negativo
        if(resultadoPos!=outroPos){
            resultado = resultado.set(new Numero(-resultado.resultado().valor()));
        }
        return this;
    }

    public Numero resultado(){
        return resultado.resultado();
    }
}
