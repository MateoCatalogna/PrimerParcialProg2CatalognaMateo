
package parcialcatalognamateo;


public class ParcialCatalognaMateo {

    
    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();
        
        
        Mamifero a1 = new Mamifero("Perro", 3, 10.0, TipoDieta.OMNIVORO);
        Ave a2 = new Ave(5.0,"Gorrion", 1, 1.0, TipoDieta.OMNIVORO);
        Reptil a3 = new Reptil("Queratinosa", 30.0, "Yacare", 5, 100.0, TipoDieta.CARNIVORO);        
        Mamifero a4 = new Mamifero("Perro", 3, 15.0, TipoDieta.CARNIVORO);
        Ave a5 = new Ave(7.0,"Gorrion", 1, 1.3, TipoDieta.OMNIVORO);
        Mamifero a6 = new Mamifero("Perro", 14, 17.0, TipoDieta.OMNIVORO);
        
        
        try{
            zoo.agregarAnimal(a1);
            zoo.agregarAnimal(a2);
            zoo.agregarAnimal(a3);
            zoo.agregarAnimal(a6);
            System.out.println("------------------");
            zoo.agregarAnimal(a4);
            
        }catch(AnimalDuplicadoException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("------------------");

        zoo.mostrarAnimales();
        
        System.out.println("------------------");
        
        zoo.vacunarAnimales();
    }
    
}
