package adivinanumero;

import javax.swing.JOptionPane;

public class Juego {

    int numIntentos;
    int jugador1;
    int jugador2;

    public void Adivinar() {
        //pedir bucle do while para que repita numero si las condiciones no son las que quiero
        do {
            jugador1 = Integer.parseInt(JOptionPane.showInputDialog("introduce numero a adivinar"));
        } while (jugador1 <= 0 || jugador1 > 50);
        //pedir otro bucle do while con el numero de intentos con la condicion que no puede ser <=0
        do {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("introduce numero a adivinar"));
        } while (numIntentos <= 0);
        //pedir bucle for para conseguir adivinar el numero 
        for (int i = 0; i < numIntentos; i++) {

            JOptionPane.showInputDialog("Jugador 2 adivina");
            if (jugador1 < jugador2) {
                JOptionPane.showMessageDialog(null, "el numero tecleado es mayor");
            } else if (jugador1 > jugador2) {
                JOptionPane.showMessageDialog(null, "el numero teclaado es menor");
            } else {
                JOptionPane.showMessageDialog(null, "el numero es correcto");
            }
        }

    }
}
