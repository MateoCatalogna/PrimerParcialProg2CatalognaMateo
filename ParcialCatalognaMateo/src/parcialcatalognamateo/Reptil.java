
package parcialcatalognamateo;


public class Reptil extends Animal {
    
    private String tipoEscama;
    private double regulacionTemperatura;

    public Reptil(String tipoEscama, double regulacionTemperatura, String nombre, int edad, double peso, TipoDieta dieta) {
        super(nombre, edad, peso, dieta);
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tipoEscama=" + tipoEscama + ", regulacionTemperatura=" + regulacionTemperatura + '}';
    }
    
    
}
