package ex04;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int check = 0, choice;
        
        Lampada lampadaIncandescente = new Lampada();
        lampadaIncandescente.interruptor = 0;
        
        while(check == 0){
            if(lampadaIncandescente.interruptor == 0){
                lampadaIncandescente.estado = "APAGADA";
            }
            if(lampadaIncandescente.interruptor == 1){
                lampadaIncandescente.estado = "ACESA";
            }
            
            choice = Integer.parseInt(JOptionPane.showInputDialog("ESTADO DA LÂMPADA: " + lampadaIncandescente.estado 
                    + "\n\n1 - Pressionar interruptor\n2 - Sair do cômodo"));
            
            if(choice == 1){
                if(lampadaIncandescente.interruptor == 0){
                    lampadaIncandescente.interruptor++;
                }
                else if(lampadaIncandescente.interruptor == 1){
                    lampadaIncandescente.interruptor--;
                }
            }
            
            if(choice == 2){
                JOptionPane.showMessageDialog(null, "Você retirou-se do cômodo, deixando a lâmpada " + lampadaIncandescente.estado + ".");
                System.exit(0);
            }
        }
    }
}
