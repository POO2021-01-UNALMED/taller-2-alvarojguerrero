package test;
public class Auto {

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidacreados;

    public int cantidadAsientos() {
        int contador = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        String estado = "Auto original";
        for (int i = 0; i < asientos.length; i++) {
            if ( (asientos[i]!=null) &&  (!(motor.registro == registro) || !(registro == asientos[i].registro))) {
                estado = "Las piezas no son originales";
                break;
            }
        }
        return estado;

    }

    public static void main(String[] args) {
        Auto aut = new Auto();
        Motor mot = new Motor();
        aut.registro = 32;
        mot.registro = 32;
        aut.motor = mot;
        aut.asientos = new Asiento[5];
        aut.asientos[0] = new Asiento();
        aut.asientos[0].registro = 32;
        aut.asientos[4] = new Asiento();
        aut.asientos[4].registro = 32;

        Auto aut2 = new Auto();
        Motor mot2 = new Motor();
        aut2.registro = 32;
        mot2.registro = 32;
        aut2.motor = mot2;
        aut2.asientos = new Asiento[5];
        aut2.asientos[0] = new Asiento();
        aut2.asientos[0].registro = 40;
        aut2.asientos[4] = new Asiento();
        aut2.asientos[4].registro = 32;

        System.out.println(aut2.verificarIntegridad());

    }

}
