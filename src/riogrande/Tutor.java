/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riogrande;

/**
 *
 * @author patriciaortiz
 */
public class Tutor extends Perfil implements IUsuario, ICalificaciones {
    private static final String tutor = "Usuario: Tutor(a)";
    private Alumno alumno; //relacion con el alumno
    
    Tutor(int id, String nombre, String apellido, String email, Alumno alumno){
    super(id, nombre, apellido, email);
    this.alumno = alumno;
    }
    
   @Override
   public void imprimirUsuario(){
   System.out.println(tutor);
   }
    
    
    @Override
    String imprimirPerfil(){
    return "ID: " +this.getId() + 
            ", Nombre: "+ this.getNombre() +
            ", Apellido: " + this.getApellido() +
            ", Email: " + this.getEmail();
    }
    
    @Override
    public void mostrarCalificaciones(){
        if (alumno != null) {
            System.out.println("Calificación actual del alumno(a) " + alumno.getNombre() + ": " + alumno.getCalificacion());
        } else {
            System.out.println("Este tutor no tiene un alumno(a) asignado.");
        }
    }
    
    @Override
   public void guardarCalificacion(int calificacion){
        if (alumno != null) {
            alumno.guardarCalificacion(calificacion);
            System.out.println("Tutor ha actualizado la calificación de " + alumno.getNombre());
        } else {
            System.out.println("No hay alumno(a) para asignar calificación.");
        }
    }
}
