
package parcialcatalognamateo;


public class Ave extends Animal implements Vacunable{
    
    private double envergaduraAlas;

    public Ave(double envergaduraAlas, String nombre, int edad, double peso, TipoDieta dieta) {
        super(nombre, edad, peso, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public String toString() {
        return "Ave{" + "envergaduraAlas=" + envergaduraAlas + '}';
    }
    

    public void vacunar(){
        System.out.println(super.getNombre() + " vacunado");
    }
    
}
