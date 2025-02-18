import java.util.Scanner;
public class MinhaClasse {

    public static void main (String [] args) {
      Scanner CALC = new Scanner(System.in);
      int a, b, conta;
      a = CALC.nextInt();
      b = CALC.nextInt();
      conta = a+b;
      System.out.println("SOMA = " + conta);  

      String primeiroNome = "Luiz";
      String segundoNome ="Otávio";
      String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); 
      System.out.println(nomeCompleto);  
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
