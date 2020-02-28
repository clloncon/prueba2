package cl.awakelab.evaluacion;

public class Lavadora extends Electrodomesticos {
    
    //Atributo
    
    /** atributo
     @carga
     */
    
    private int carga;
    
    //Constante
    
    /**Valor por defecto
     */
    
    private final int def_peso = 5;
    
    //Constructores
    
    /** Constructor por defecto
     */
    
    public Lavadora () {
        super();
        this.carga = def_peso;
        
    }
    
    /** Constructor precio y peso
     * @param precioBase
     * @param peso
     */
    
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = def_peso;
    }
    
    /**Constructor heredado
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
          
    }
    
    //Metodos
    
    public int precioFinal() {
        if (carga > 30)
            return super.precioFinal() + 50;
        else
            return super.precioFinal();
    }
    
    //Get

    public int getCarga() {
        return carga;
    }
    
       

}
    

    
  
    