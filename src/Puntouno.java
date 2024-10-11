import javax.swing.*;

public class Puntouno {
    public static void main(String[] args) {
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese su dia de nacimiento"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese su mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("ingrese su año de nacimiento"));
        JOptionPane.showMessageDialog(null, "su fecha de nacimiento es "+dia+"/"+mes+"/"+año);
        if (dia>=20 && mes==1 || dia<=18 && mes==2) {
            JOptionPane.showMessageDialog(null, "su signo es acuario");
        }
        if (dia>=19 && mes==2 || dia<=20 && mes==3) {
            JOptionPane.showMessageDialog(null, "su signo es piscis");
        }
        if (dia>=21 && mes==3 || dia<=19 && mes==4) {
            JOptionPane.showMessageDialog(null, "su signo es aries");
        }
        if (dia>=20 && mes==4 || dia<=20 && mes==5) {
            JOptionPane.showMessageDialog(null, "su signo es tauro");
        }
        if (dia>=21 && mes==5 || dia<=20 && mes==6) {
            JOptionPane.showMessageDialog(null, "su signo es geminis");
        }
        if (dia>=21 && mes==6 || dia<=22 && mes==7) {
            JOptionPane.showMessageDialog(null, "su signo es cancer");
        }
        if (dia>=23 && mes==7 || dia<=22 && mes==8) {
            JOptionPane.showMessageDialog(null, "su signo es leo");
        }
        if (dia>=23 && mes==8 || dia<=22 && mes==9) {
            JOptionPane.showMessageDialog(null, "su signo es virgo");
        }
        if (dia>=23 && mes==9 || dia<=22 && mes==10) {
            JOptionPane.showMessageDialog(null, "su signo es libra");
        }
        if (dia>=23 && mes==10 || dia<=21 && mes==11) {
            JOptionPane.showMessageDialog(null, "su signo es escorpio");
        }
        if (dia>=22 && mes==11 || dia<=21 && mes==12) {
            JOptionPane.showMessageDialog(null, "su signo es sagitario");
        }
        if (dia>=22 && mes==12 || dia<=19 && mes==1) {
            JOptionPane.showMessageDialog(null, "su signo es capricornio");
        }
    }
}
