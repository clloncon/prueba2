package cl.awakelab.evaluacion;

public class Television extends Electrodomesticos {
    
    //Atributos
    
    /** atributos
    @param atributo
    @param sintonizador
    */
    
    private int resolucion;
    private boolean sintonizador;

    //Valores por defecto de resolucion y sintonizador
    
    private final int def_res = 20;
    private final boolean def_sint = false;
    
    //Constructores
    
    /**Constructor por defecto
     * @param resolucion
     * @param sintonizador
     */
    
    public Television() {
        super();
        this.resolucion = def_res;
        this.sintonizador = def_sint;
    }
    
    /**Constructor precio y peso */
    
    public Television (int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = def_res;
        this.sintonizador = def_sint;
        
    }
    
    /** Constructor heredado
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso 
     */
    public Television(int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        
    }
    
    //Metodos
    
   
    public int precioFinal() {
        int monto = super.precioFinal();
        if (this.resolucion>40 ) {
            monto += monto*30/100;
        }
        if (this.sintonizador = true) {
            monto +=50;
        }
        return monto;
    }

    
    //Get

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    
    
    

    

}
