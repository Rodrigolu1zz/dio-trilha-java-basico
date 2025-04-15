package candidatura;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo!");
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};

        int candidadosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        // int[] candidadosAprovados = new int[10];
        ArrayList<Integer> candidatosAprovados = new ArrayList<>();
        while (candidadosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.print("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido + ".");
            //analisarCandidato(salarioPretendido);
            System.out.println();
            if (salarioBase >= salarioPretendido){
                candidadosSelecionados++;
                candidatosAprovados.add(candidatosAtual);
            }
            candidatosAtual++;
        }
        System.out.println("Posições dos candidatos selecionados: " + candidatosAprovados);
        for (int i = 0; i<candidatosAprovados.size(); i++){
            int j = candidatosAprovados.get(i);
            System.out.println(candidatos[j] + " foi um candidato selecionado, vamos entrar em contato!");
        }
        
    }

    static double valorPretendido(){
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.print(" Vamos ligar para ele");
        }else if (salarioBase == salarioPretendido){
            System.out.print(" Vamos ligar com uma contra porposta");
        }
        else {
            System.out.print(" Não vamos ligar para o funcionário");
        }
    }
}
