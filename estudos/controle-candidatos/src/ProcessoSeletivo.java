import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
    //  selecaoCandidatos();
      //imprimirSelecionados();
      String[] candidatos = {"FELIPE", "MARCIA","JULIA", "PAULO", "AUGUSTO"};
      for(String candidato: candidatos){
        entrandoEmContato(candidato);
      }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do{
        atendeu = atender();
        continuarTentando = !atendeu;
        if (continuarTentando) {
            tentativasRealizadas++;
        }
        else{
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }
        
        }while(continuarTentando && tentativasRealizadas<3);
        if (atendeu) {
            System.out.println("Candidato "+candidato+" atendeu a ligacao na tentativa "+tentativasRealizadas);
            
        }
        else{
            System.out.println("Candidato "+candidato+" nao atendeu a ligacao, Numero maximo de tentativas "+tentativasRealizadas);
        }
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;   
    }

    static void imprimirSelecionados(){
     String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO"};
     System.out.println("Imprimindo a lista de canditados informado o indice do elemento");

     for (int i = 0; i < candidatos.length; i++) {
         System.out.println("Candidato de numero "+(i+1)+" "+candidatos[i]);
     }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados<5 && candidatosAtual< candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: "+candidato + " Solicitou este valor de salario "+salarioPretendido);
            if(salarioBase>salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para vaga");
                candidatosSelecionados++;
        }
        candidatosAtual++;
    }
}  

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase>salarioPretendido){
            System.out.println("Ligar pro candidato ");
        }else if (salarioBase==salarioPretendido){
            System.out.println("Ligar pro candidato com contra proposta");
    }else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
