/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riogrande;

/**
 *
 * @author patriciaortiz
 */
public class Maestro extends Perfil implements IUsuario{
    
    private static final String maestro = "Usuario: Maestro(a)";
    
    Maestro(int id, String nombre, String apellido, String email){
    super(id, nombre, apellido, email);
    }
    
   @Override
   public void imprimirUsuario(){
   System.out.println(maestro);
   }
    
    
    @Override
    String imprimirPerfil(){
    return "ID: " +this.getId() + 
            ", Nombre: "+ this.getNombre() +
            ", Apellido: " + this.getApellido() +
            ", Email: " + this.getEmail();
    }


}
