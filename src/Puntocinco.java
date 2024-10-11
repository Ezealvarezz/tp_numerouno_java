import javax.swing.*;

public class Puntocinco {
    public static void main(String[] args) {
        double km, litros, precio, consumo, gasto;
        km = Double.parseDouble(JOptionPane.showInputDialog("ingrese los km del viaje"));
        litros = Double.parseDouble(JOptionPane.showInputDialog("Cuantos litros consume su vehiculo por km"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro de la nafta"));
        consumo = litros * km;
        gasto = consumo * precio;
        JOptionPane.showMessageDialog(null,"el gasto total del viaje es "+gasto+" se comsumieron "+consumo+" litros");
    }
}
