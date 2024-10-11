import javax.swing.*;

public class Puntoseis {
    public static void main(String[] args) {
        double horas, materias;
        horas = Double.parseDouble(JOptionPane.showInputDialog("cuantas horas puede estudiar por dia"));
        materias = Double.parseDouble(JOptionPane.showInputDialog("cuantas materias tiene"));
        JOptionPane.showMessageDialog(null,"puede dedicarle "+horas/materias+"a cada materia");
    }
}
