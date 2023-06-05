public class Television extends Electrodomestico{

    private int resolucion;
    private boolean sintonizador;

    private final int RESOLUCION_PREDEF = 20;
    private final boolean SINTONIZADOR_PREDEF = false;

    public Television() {
    }

    public Television(int precio, int peso) {
        super(precio, peso);
    }

    public Television(int precio, String color, char consumo, int peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    @Override
    public int calcularPrecioFinal() {
        if (resolucion > 40){
            return super.calcularPrecioFinal() + ((super.calcularPrecioFinal() * 30)/100);
        }
        if (sintonizador){
            return super.calcularPrecioFinal() + 50;
        }
        else {
            return super.calcularPrecioFinal();
        }
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public int getRESOLUCION_PREDEF() {
        return RESOLUCION_PREDEF;
    }

    public boolean isSINTONIZADOR_PREDEF() {
        return SINTONIZADOR_PREDEF;
    }

}
