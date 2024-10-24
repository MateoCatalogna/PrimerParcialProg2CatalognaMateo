
package parcialcatalognamateo;


public class Mamifero extends Animal implements Vacunable {

    public Mamifero(String nombre, int edad, double peso, TipoDieta dieta) {
        super(nombre, edad, peso, dieta);
    }

    @Override
    public String toString() {
        return "Mamifero{" + "Peso= "+ super.getPeso() + " , Dieta= " + super.getDieta()+'}';
    }
    
    public void vacunar(){
        System.out.println(super.getNombre() + " vacunado");
    }
    
}
