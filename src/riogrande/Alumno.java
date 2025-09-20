/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riogrande;

/**
 *
 * @author patriciaortiz
 */
public class Alumno extends Perfil implements IUsuario, ICalificaciones{
      
    private static final String alumno = "Usuario: Alumno(a)";
    private int calificacion;
    
    Alumno(int id, String nombre, String apellido, String email){
    super(id, nombre, apellido, email);
    }
    
   @Override
   public void imprimirUsuario(){
   System.out.println(alumno);
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
    System.out.println("Tu calificación es de: " + calificacion);
    }
    
    
    @Override
    public void guardarCalificacion(int calificacion){
    this.calificacion =calificacion;
    System.out.println("Calificacion guardada: " + calificacion);
    }
    
    public int getCalificacion(){
    return this.calificacion;
    }
    
}
