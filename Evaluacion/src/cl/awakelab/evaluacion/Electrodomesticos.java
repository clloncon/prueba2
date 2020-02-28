package cl.awakelab.evaluacion;

public class Electrodomesticos {
    
  //atributos
    
    /** atributos
    @param precioBase
    @param color
    @param consumoEnergetico
    @param peso
    */
    
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    
    //valores por defecto
    private final int def_precio = 100;
    private final String def_color = "blanco";
    private final char def_consEnergetico = 'F';
    private final int def_peso = 5;
    
    
    //listado valores que podra tomar
    public static final char consEner [] = {'A', 'B', 'C', 'D', 'F', 'E'};
    public static final String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
    
    
    //constructores
    public Electrodomesticos () {
        this.precioBase = def_precio;
        this.color = def_color;
        this.consumoEnergetico = def_consEnergetico;
        this.peso = def_peso;
    }
    
    /**
     * Se crea un constructor con precio y peso
     * @param precioBase Valor del electrodomestico
     * @param peso Peso del electrodomestico
     */
    
    public Electrodomesticos(int precioBase, int peso) {
        this();
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
    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
        this(precioBase,peso);
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        
    }
    
    /**Comprueban letra y color correcto */
    
    //Metodos
    
    private char comprobarConsumoEnergetico(char consEner) {
        return consEner;
    }

    private String comprobarColor(String colores) {
        return colores;
            
    }
    
    public int precioFinal() {
        int precioConsumo = 0;
        int precioTamano = 0;
        return precioTamano;
    }

    
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

    
    

    
    
    
    
    
    
    


