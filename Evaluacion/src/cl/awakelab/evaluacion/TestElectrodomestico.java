package cl.awakelab.evaluacion;

import junit.framework.TestCase;

public class TestElectrodomestico extends TestCase {
    private Electrodomesticos electrodomesticos;
    
  //atributos
    
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    //valores por defecto y los que podra tomar aleatoriamente
    private final int def_precio = 100;
    private final String def_color = "blanco";
    private final char def_consEnergetico = 'F';
    private final int def_peso = 5;
    
    public static final char consEner [] = {'A', 'B', 'C', 'D', 'F', 'E'};
    public static final String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    
    //constructores
    public void Electrodomesticos () {
        this.precioBase = def_precio;
        this.color = def_color;
        this.consumoEnergetico = def_consEnergetico;
        this.peso = def_peso;
    }
    
    /**
     * Se crea un constructor con precio y peso
     * 
     * @param precioBase Valor del electrodomestico
     * @param peso Peso del electrodomestico
     */
    
    public void Electrodomesticos(int precioBase, int peso) {
        
        this.precioBase = precioBase;
        this.peso = peso;
    }
    
    /**
     * Se crea constructor con todos los atributos
     * @param precioBase
     * @param color 
     * @param consumoEnergetico
     * @param peso 
     */
    public void Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
  
    }
    
    //Metodos
    
    

    
    //Get

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
        
    }
    
    //Set

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}

    
