
package parcialcatalognamateo;

import java.util.ArrayList;


public class Zoologico {
    private ArrayList<Animal> animales;
    
    
    public Zoologico(){
        this.animales = new ArrayList<Animal>();
    }
    
    
    public void agregarAnimal(Animal animal){
        if(animales.contains(animal)){
            throw new AnimalDuplicadoException("El animal " + animal.getNombre() + " ya esta en el zoologico");
        }
        System.out.println("Animal " + animal.getNombre() + " agregado");
        animales.add(animal);
    }
    
    public void mostrarAnimales(){
        if (animales.size() <= 0){
            System.out.println("No hay animales en el zoologico");
        }
        for (Animal animal : animales){
            System.out.println(animal);
        }
    }
    
    
    
    // Vacuna a los animales que dentro de la lista de animales que son una instancia de la interfaz Vacunable
    public void vacunarAnimales(){
        for(Animal animal : animales){
            if(animal instanceof Vacunable){
                ((Vacunable) animal).vacunar();
            }else{
                System.out.println(animal.getNombre() + " no es vacunable");
            }
        }
    }
}
