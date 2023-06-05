public class Lavadora extends Electrodomestico{

    private int carga = 0;
    private final int CARGA_PREDEF = 5;

    public Lavadora() {
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCARGA_PREDEF() {
        return CARGA_PREDEF;
    }

    @Override
    public int calcularPrecioFinal() {
        if(carga > 30){
            return super.calcularPrecioFinal() + 50;
        }
        else {
            return super.calcularPrecioFinal();
        }
    }
}
