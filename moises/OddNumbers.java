package moises;
import javax.swing.JOptionPane;
public class OddNumbers {
    public static void main(String[]args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para analizar: "));

        if (number % 2 == 0) {
            JOptionPane.showInputDialog(args, "El numero ingresado es par. ");
        }else{
            JOptionPane.showMessageDialog(null, "El numero ingresado es impar. ");
        }
    }
}