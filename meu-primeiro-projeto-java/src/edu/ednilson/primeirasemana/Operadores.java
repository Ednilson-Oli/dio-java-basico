package edu.ednilson.primeirasemana;

public class Operadores {
    public static void main(String args[]){
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;
        numero= - numero;
        System.out.println( numero);
        
        numero = numero * -1;
        System.out.println(numero);

        //x repeticao
        //numero =numero +1;
        //numero++;
        //abaixo o incremento ocorre apos saida do numero
        System.out.println(numero++);
    //abaixo o incremento ocorre antes da saida do numero
    System.out.println(++numero);
        //apos aplica o ++
        System.out.println(numero);
        boolean variavel =true;
        variavel = !variavel;
        System.out.println(variavel);
    }
}
