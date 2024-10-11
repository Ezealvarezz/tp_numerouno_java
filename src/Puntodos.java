import javax.swing.*;

public class Puntodos {
    public static void main(String[] args) {
        int minutos, calorias, quemadas;
        String deporte;
        calorias = 0;
        quemadas = 0;
        deporte = JOptionPane.showInputDialog("Que actividad realiza? nadar/correr/bici");
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Durante cuantos minutos?"));
        switch (deporte) {
            case "bici":
                calorias = 24;
                quemadas = calorias * minutos;
                JOptionPane.showMessageDialog(null, "usted ha quemado " + quemadas + " calorias");
                break;
            case "correr":
                calorias = 56;
                quemadas = calorias * minutos;
                JOptionPane.showMessageDialog(null, "usted ha quemado " + quemadas + " calorias");
                break;
            case "nadar":
                calorias = 15;
                quemadas = calorias * minutos;
                JOptionPane.showMessageDialog(null, "usted ha quemado " + quemadas + " calorias");
                break;
        }
    }
}