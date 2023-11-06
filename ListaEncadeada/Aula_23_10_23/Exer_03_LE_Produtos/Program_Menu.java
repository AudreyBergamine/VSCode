package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

// Recursividade


import javax.swing.JOptionPane;

public class Program_Menu {   
    
    public static void main(String[] args) {
    	Lista list = new Lista();

        showMenu(list);

    }
        
    // Mostrar menu para o usuário
    public static void showMenu(Lista list ) {
    int menu = -1;    
    while (menu != 5) { 
      menu = Integer.parseInt(JOptionPane.showInputDialog("\n*| DIGITE A OPÇÃO DESEJADA |*  \n\n"
                                                            + "1 - Cadastrar Produtos ( Descrição e Valor) \n"
                                                            + "2 - Verificar se tem Produtos \n"
                                                            + "3 - Exibir os produtos da lista \n"
                                                            + "4 - Limpar a Lista \n"
                                                            + "5 - Sair \n"
                                                            + "\n"));                                             
              
        switch (menu) {
        case 1:  //1 -  Cadastrar Produtos ( Descrição e Valor) 
            String desc = JOptionPane.showInputDialog("Insira a descrição do produto: \n");
            Double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor: \nExemplo: 10.00 \n\n"));

            Produtos produto = new Produtos(desc, valor);
            list.adiciona(produto);
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!!");
            break;

        case 2:  // 2 -  Verificar se tem Produtos
            if (list.vazia()) {
                JOptionPane.showMessageDialog(null, "A lista está vazia.");
            } else {
                JOptionPane.showMessageDialog(null, "A lista contém produtos ");
            }
            break;

        case 3:  // 3 -   Exibir os produtos da lista 
            list.print();            
            break;

        case 4:  //  4 -   Limpar a Lista 
            list.limpar();
            JOptionPane.showMessageDialog(null, "Lista limpa.");
            break;
            
        case 5:  // 0 - Sair do Programa
        	JOptionPane.showMessageDialog(null, "Saindo do programa...");
        	break;

        default:
            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número válido!");
        }
    }
    }  
    
    
        
}
