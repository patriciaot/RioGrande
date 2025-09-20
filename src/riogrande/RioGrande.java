/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riogrande;

/**
 *
 * @author patriciaortiz
 */
public class RioGrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Maestro maestro = new Maestro (1, "Patricia", "Ortiz Tellez", "ot.patricia1@gmail.com");
        maestro.imprimirUsuario();
        maestro.imprimir();
        
        Alumno alumno1 = new Alumno (1, "Fernanda", "Alvarez Martinez", "fer.am@gmail.com");
        alumno1.imprimirUsuario();
        alumno1.imprimir();
        alumno1.guardarCalificacion(8);
        alumno1.mostrarCalificaciones();
        
        Tutor tutor = new Tutor (5, "Rosario", "Castellanos", "rosario.castellanos@gmail.com", alumno1);
        tutor.imprimirUsuario();
        tutor.imprimir();
        tutor.mostrarCalificaciones(); //Muestra calificacion del alumno
        tutor.guardarCalificacion(10);//tutor asigna nueva calificacion
        tutor.mostrarCalificaciones(); //Refleja la nueva calificacion
        
    }
       
}//RioGrande 