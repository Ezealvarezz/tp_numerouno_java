import javax.swing.*;
public class Puntosiete {
    public static void main(String[] args) {
        int satisfaccion, estres, salud, felicidad;
        satisfaccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nivel de satisfacción con la vida (1-10):"));
        estres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nivel de estrés (1-10):"));
        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nivel de salud (1-10):"));
        felicidad = (satisfaccion + salud) - estres;
        JOptionPane.showMessageDialog(null, "Su índice de felicidad es: " + felicidad);
    }
}

