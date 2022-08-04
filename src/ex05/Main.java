package ex05;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int check = 0, choice;
        
        TV televisao = new TV();
        televisao.estado = "desligada";
        
        while(check == 0){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Opções:\n1 - Ligar televisão\n2 - Desligar televisão\n3 - Quebrar televisão"
                    + "\n4 - Observar estado da televisão" + "\n5 - Deixar cômodo"));
            
            if(choice == 1){
                if("desligada".equals(televisao.estado)){
                    televisao.estado = "ligada";
                }
                else if("ligada".equals(televisao.estado)){
                    JOptionPane.showMessageDialog(null, "A televisão já se encontra ligada.");
                }
                else if("quebrada".equals(televisao.estado)){
                    JOptionPane.showMessageDialog(null, "A televisão está quebrada e não pode mais ser ligada.");
                }
            }
            
            if(choice == 2){
                if("ligada".equals(televisao.estado)){
                    televisao.estado = "desligada";
                }
                else if("desligada".equals(televisao.estado)){
                     JOptionPane.showMessageDialog(null, "A televisão já se encontra desligada.");
                }
                else if("quebrada".equals(televisao.estado)){
                    JOptionPane.showMessageDialog(null, "A televisão está quebrada e não necessita mais ser desligada.");
                }
            }
            
            if(choice == 3){
                televisao.estado = "quebrada";
            }
            
            if(choice == 4){
                JOptionPane.showMessageDialog(null, "Atual estado da televisão: " + televisao.estado + ".");
            }
            
            if(choice == 5){
                JOptionPane.showMessageDialog(null, "Você retirou-se do cômodo, deixando a televisão " + televisao.estado + ".");
                System.exit(0);
            }
        }
    }
}
