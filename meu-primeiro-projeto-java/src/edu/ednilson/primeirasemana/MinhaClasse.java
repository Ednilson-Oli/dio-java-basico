package edu.ednilson.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Boas Vindas turma DIO");
        
        String primeiroNome ="Ednilson";
        String segundoNome ="Oliveira";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       
        System.out.println(nomeCompleto);

     //todos os metodos no infinitivo ex: String formatarCep(log Cep)
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}