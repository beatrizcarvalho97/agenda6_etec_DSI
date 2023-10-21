package agenda06;

import javax.swing.JOptionPane;

public class Agenda06 {

    public static void main(String[] args) {
        int digitoPlaca;
        digitoPlaca = Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo a Vale Card!\nDigite o digito final da sua placa para identificar o vencimento (0 à 9):"));
        
        switch(digitoPlaca){
            case 1:
                JOptionPane.showMessageDialog(null, "Para Placa final 1, o vencimento é 30/04");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Para Placa final 2, o vencimento é 31/05");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Para Placa final 3, o vencimento é 30/06");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Para Placa final 4, o vencimento é 31/07");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Para Placa final 5, o vencimento é 31/08");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Para Placa final 6, o vencimento é 30/09");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Para Placa final 7, o vencimento é 31/10");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Para Placa final 8, o vencimento é 30/11");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Para Placa final 9, o vencimento é 31/12");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Para Placa final 0, o vencimento é 31/12");
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Digito invàlido.");
                break;
        }
    }
    
}
