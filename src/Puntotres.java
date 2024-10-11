import javax.swing.*;

public class Puntotres {
    public static void main(String[] args) {
        int nivel;
        nivel = Integer.parseInt(JOptionPane.showInputDialog("seleccione su nivel\n 1-principiante\n 2-intermedio\n 3-avanzado"));
        switch (nivel){
            case 1:
                JOptionPane.showMessageDialog(null, "cinta 5min\n press de banca 3x10\n brazos 3x8");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "cinta 10min\n press de banca 4x10\n brazos 4x8");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "cinta 15min\n press de banca 4x12\n brazos 4x10");
                break;
        }
    }
}
