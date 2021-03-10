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
        Auto a = new Auto();
        Motor m = new Motor();
        a.registro = 32;
        m.registro = 32;
        a.motor = m;
        a.asientos = new Asiento[5];
        a.asientos[0] = new Asiento();
        a.asientos[0].registro = 32;
        a.asientos[4] = new Asiento();
        a.asientos[4].registro = 32;

        Auto a2 = new Auto();
        Motor m2 = new Motor();
        a2.registro = 32;
        m2.registro = 32;
        a2.motor = m2;
        a2.asientos = new Asiento[5];
        a2.asientos[0] = new Asiento();
        a2.asientos[0].registro = 40;
        a2.asientos[4] = new Asiento();
        a2.asientos[4].registro = 32;

        System.out.println(a2.verificarIntegridad());

    }

}
