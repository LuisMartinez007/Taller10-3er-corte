package Taller10.Ejercicio1;

public class Prueba {

    public class PruebaPolimorfismo { 

    public static void main(String[] args) {
    // Crear una instancia de Persona 
    Persona persona = new Persona();
    persona.presentarse(); System.out.println("-------------------------"); 
    // Crear una instancia de Estudiante
    Persona estudiante = new Estudiante(); 
    estudiante.presentarse(); System.out.println("-------------------------"); 
    // Crear una instancia de Profesor 
    Persona profesor = new Profesor(); 
    profesor.presentarse(); }
}
}
