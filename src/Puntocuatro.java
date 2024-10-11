import javax.swing.*;

public class Puntocuatro {
    public static void main(String[] args) {
        String animo;
        animo = JOptionPane.showInputDialog("ingrese su estado de animo");
        if (animo.equals("feliz")){
            JOptionPane.showMessageDialog(null,"cuarteto\ncumbia");
        } else if (animo.equals("triste")) {
            JOptionPane.showMessageDialog(null,"amor\njazz");
        } else if (animo.equals("energico")) {
            JOptionPane.showMessageDialog(null,"hard rock\nmetal");
        } else {
            JOptionPane.showMessageDialog(null,"rock\nblues");
        }
    }
}
