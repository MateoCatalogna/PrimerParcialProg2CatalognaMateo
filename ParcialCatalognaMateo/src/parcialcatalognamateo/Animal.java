
package parcialcatalognamateo;

import java.util.Objects;


public abstract class Animal {
    
    private String nombre;
    private int edad;
    private double peso;
    private TipoDieta dieta;

    public Animal(String nombre, int edad, double peso, TipoDieta dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dieta = dieta;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public TipoDieta getDieta(){
        return dieta;
    }


    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", dieta=" + dieta + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, peso, dieta);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Animal a = (Animal) obj;
        return nombre.equals(a.nombre) && edad == a.edad;
    }
    
    
    
    
    
}
