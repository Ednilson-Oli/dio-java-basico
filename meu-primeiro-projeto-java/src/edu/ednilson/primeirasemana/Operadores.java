package edu.ednilson.primeirasemana;



public class Operadores {
    public static void main(String args[]){
       /*  String nomeCompleto = "LINGUAGEM" + "JAVA";

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

    */
    //utilizando if else com operador alternario
        int a,b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro":"falso";
        
        System.out.println(resultado);
   
        int numero1 = 1; 
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm e igual a numeroDois? " + simNao);

             simNao = numero1 != numero2;

        System.out.println("numeroUm e diferente de numeroDois? " + simNao);

             simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que numeroDois? " + simNao);

        String nomeUm ="EDNILSON";
        String nomedois = new String("EDNILSON");
         System.out.println(nomeUm == nomedois);
        //Para comparação entre objetos utilizamos o equals
         System.out.println(nomeUm.equals(nomedois));

        // operadores Logicos 
        //&& Operador Lógico "E"
        // || Operador Lógico "ou"

        boolean condicao1 =true;
        boolean condicao2 =true;

        if (condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");

        }
        if (condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");

        }
        System.out.println("fim");
     }
    }
