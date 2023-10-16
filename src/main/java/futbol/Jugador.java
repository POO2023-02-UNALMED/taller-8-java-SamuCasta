package futbol;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesRecibidos;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return false;
    }

    public int compareTo(Object f) {
        return Math.abs(this.getEdad() - ((Futbolista) f).getEdad());
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }
}
