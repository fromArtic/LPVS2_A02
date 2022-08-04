package ex02;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int voto, check = 0;
        int cndt1 = 0, cndt2 = 0, cndt3 = 0, nulo = 0, branco = 0;
        
        //Menu introdutório
        JOptionPane.showMessageDialog(null, "MENU:\n1, 2, 3 - Voto para os respectivos candidatos\n4 - Voto nulo\n5 - Voto em branco\n"
                + "0 - Mostrar resultados e encerrar\n\nQualquer outro código será registrado como um voto nulo.");
        
        //Votações
        while(check == 0){
            voto = Integer.parseInt(JOptionPane.showInputDialog("Informe seu voto:"));
            
            if(voto == 1){
                cndt1++;
            }
            if(voto == 2){
                cndt2++;
            }
            if(voto == 3){
                cndt3++;
            }
            if(voto == 4 || voto > 5 || voto < 0){
                nulo++;
            }
            if(voto == 5){
                branco++;
            }
            if(voto == 0){
                check++;
            }
        }
        
        //Saídas
        JOptionPane.showMessageDialog(null, "N° de votos para o candidato 1: " + cndt1 + "\nN° de votos para o candidato 2: " + cndt2 
                + "\nN° de votos para o candidato 3: " + cndt3 + "\nN° de votos nulos: " + nulo + "\nN° de votos em branco: " + branco);
        if(cndt1 > cndt2 && cndt1 > cndt3){
            JOptionPane.showMessageDialog(null, "O candidato 1 foi eleito com a maior quantidade de votos.");
        }
        else if(cndt2 > cndt1 && cndt2 > cndt3){
            JOptionPane.showMessageDialog(null, "O candidato 2 foi eleito com a maior quantidade de votos.");
        }
        else if(cndt3 > cndt1 && cndt3 > cndt2){
            JOptionPane.showMessageDialog(null, "O candidato 3 foi eleito com a maior quantidade de votos.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possível eleger um vencedor entre os três candidatos.");
        }
    }
}
