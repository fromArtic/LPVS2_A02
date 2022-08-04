package ex03;

/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int choice, check = 0, check2, quantidadeTotal;
        String nomeProduto;
        double valorTotal = 0;
        
        //Declaração produto 1
        Produto produto1 = new Produto();
        produto1.nome = "gatorade";
        produto1.quantidade = 100;
        produto1.valor = 3.99;
        
        //Declaração produto 2
        Produto produto2 = new Produto();
        produto2.nome = "ratoeira";
        produto2.quantidade = 3;
        produto2.valor = 2;
        
        while(check == 0){
            check2 = 0;
            //Menu de opções
            choice = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n1 - Exibir estoque\n2 - Venda\n3 - Reestoque\n0 - Encerrar programa"
                    + "\n\nInsira sua escolha:"));
            
            //1 - Exibir estoque
            if(choice == 1){
                JOptionPane.showMessageDialog(null, "ESTOQUE\n\n" + produto1.nome + "\n- Unidades disponíveis: " + produto1.quantidade 
                        + "\n- Valor unitário: R$" + produto1.valor + "\n\n" + produto2.nome + "\n- Unidades disponíveis: " 
                        + produto2.quantidade + "\n- Valor unitário: R$" + produto2.valor);
            }
            
            //2 - Venda
            if(choice == 2){
                //Requisição do nome do produto
                nomeProduto = JOptionPane.showInputDialog("VENDA\n\nInforme o nome do produto (apenas em letras minúsculas):");
                //Validação do produto
                if(nomeProduto.equals(produto1.nome) || nomeProduto.equals(produto2.nome)){
                    check2++;
                }
                if(check2 == 1){
                    //Requisição da quantidade
                    quantidadeTotal = Integer.parseInt(JOptionPane.showInputDialog("VENDA\n\nNúmero de unidades:"));
                    
                    //Venda do produto 1
                    if(nomeProduto.equals(produto1.nome)){
                        if(quantidadeTotal <= produto1.quantidade){
                            produto1.quantidade -= quantidadeTotal;
                            valorTotal = produto1.valor * quantidadeTotal;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Não há estoque suficiente do produto requisitado.");
                            check2--;
                        }
                    }
                    
                    //Venda do produto 2
                    if(nomeProduto.equals(produto2.nome)){
                        if(quantidadeTotal <= produto2.quantidade){
                            produto2.quantidade -= quantidadeTotal;
                            valorTotal = produto2.valor * quantidadeTotal;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Não há estoque suficiente do produto requisitado.");
                            check2--;
                        }
                    }
                    
                    if(check2 == 1){
                        //Pagamento
                        JOptionPane.showMessageDialog(null, "Valor a receber: " + valorTotal);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "O produto informado é inválido.");
                }
            }
            
            //3 - Reestoque
            if(choice == 3){
                //Requisição do nome do produto
                nomeProduto = JOptionPane.showInputDialog("REESTOQUE\n\nInforme o nome do produto (apenas em letras minúsculas):");
                //Validação do produto
                if(nomeProduto.equals(produto1.nome) || nomeProduto.equals(produto2.nome)){
                    check2++;
                }
                if(check2 == 1){
                    //Requisição da quantidade
                    quantidadeTotal = Integer.parseInt(JOptionPane.showInputDialog("REESTOQUE\n\nNúmero de unidades:"));
                    
                    //Reestoque do produto 1
                    if(nomeProduto.equals(produto1.nome)){
                        produto1.quantidade += quantidadeTotal;
                        valorTotal = produto1.valor * quantidadeTotal;
                    }
                    
                    //Reestoque do produto 2
                    if(nomeProduto.equals(produto2.nome)){
                        produto2.quantidade += quantidadeTotal;
                        valorTotal = produto2.valor * quantidadeTotal;
                    }
                    
                    //Pagamento
                    JOptionPane.showMessageDialog(null, "Valor a pagar: " + valorTotal);
                    }
                else{
                    JOptionPane.showMessageDialog(null, "O produto informado é inválido.");
                }
            }
            
            //0 - Encerrar programa
            if(choice == 0){
                JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                System.exit(0);
            }
        }
    }
}
