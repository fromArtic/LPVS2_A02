package ex01;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        double notaUm, notaDois, media, diferenca;
        
        //Leitura das notas obtidas
        notaUm = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota n°1 obtida:"));
        while(notaUm > 10 || notaUm < 0){
            notaUm = Double.parseDouble(JOptionPane.showInputDialog("ERRO. Informe uma nota válida (0 a 10):"));
        }
        notaDois = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe a nota n°2 obtida:"));
        while(notaDois > 10 || notaDois < 0){
            notaDois = Double.parseDouble(JOptionPane.showInputDialog("ERRO. Informe uma nota válida (0 a 10):"));
        }
        
        //Cálculo da média aritmética
        media = (notaUm + notaDois)/2;
        
        //Saídas
        if(media >= 6){
            diferenca = media - 6;
            if(diferenca == 0){
                //Média igual à nota de corte (aprovado)
                JOptionPane.showMessageDialog(null, "A média aritmética atingida pelo aluno em questão, " + media 
                        +  ", é equivalente à média necessária para aprovação.");
                JOptionPane.showMessageDialog(null, "Situação do aluno: APROVADO."); 
            }
            else{
                //Média superior à nota de corte (aprovado)
                JOptionPane.showMessageDialog(null, "A média aritmética atingida pelo aluno em questão foi " + media + ", " + diferenca 
                        + " pontos acima da média para aprovação (6)");
                JOptionPane.showMessageDialog(null, "Situação do aluno: APROVADO.");
            }
        }
        else{
            diferenca = 6 - media;
            //Média abaixo da nota de corte (reprovado)
            JOptionPane.showMessageDialog(null, "A média aritmética atingida pelo aluno em questão foi " + media + ", " + diferenca 
                    + " pontos abaixo da média para aprovação (6)");
            JOptionPane.showMessageDialog(null, "Situação do aluno: REPROVADO.");
        }
    }
}
