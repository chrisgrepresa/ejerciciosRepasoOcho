import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {

    private int precio = 0;
    private String color = "";
    private char consumo;
    private int peso = 0;

    private final int PRECIO_BASE = 100;
    private final String COLOR_PREDEF = "blanco";
    private final char CONSUMO_ENERGETICO_PREDEF = 'F';
    private final int PESO_PREDEF = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, int peso) {
        this.precio = calcularPrecioFinal();
        this.peso = peso;
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = calcularPrecioFinal();
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergégico(consumo);
        this.peso = peso;
    }

    public char comprobarConsumoEnergégico(char consumo) {
        if (consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' ||
                consumo == 'E' || consumo == 'F') {
            return consumo;
        } else {
            return CONSUMO_ENERGETICO_PREDEF;
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||
                color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return COLOR_PREDEF;
        }
    }

    public int calcularPrecioFinal() {
        if (consumo == 'A') {
            return precio = PRECIO_BASE + 100;
        }
        else if (consumo == 'B') {
            return precio = PRECIO_BASE + 80;
        }
        else if (consumo == 'C') {
            return precio = PRECIO_BASE + 60;
        }
        else if (consumo == 'D') {
            return precio = PRECIO_BASE + 50;
        }
        else if (consumo == 'E') {
            return precio = PRECIO_BASE + 30;
        }
        else{
            return precio = PRECIO_BASE + 10;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public String getCOLOR_PREDEF() {
        return COLOR_PREDEF;
    }

    public char getCONSUMO_ENERGETICO_PREDEF() {
        return CONSUMO_ENERGETICO_PREDEF;
    }

    public int getPESO_PREDEF() {
        return PESO_PREDEF;
    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", PRECIO_BASE=" + PRECIO_BASE +
                ", COLOR_PREDEF='" + COLOR_PREDEF + '\'' +
                ", CONSUMO_ENERGETICO_PREDEF=" + CONSUMO_ENERGETICO_PREDEF +
                ", PESO_PREDEF=" + PESO_PREDEF +
                '}';
    }
}
