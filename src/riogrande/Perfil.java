/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riogrande;

/**
 *
 * @author patriciaortiz
 */
public abstract class Perfil{
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    
    Perfil(int id, String nombre, String apellido, String email){
        this.id= id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
    }
    
    abstract String imprimirPerfil();
    
    public int getId(){
    return id;
    }
    
    public void imprimirId(){
    System.out.println("Id: " + this.id);
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void imprimirNombre(){
    System.out.println("Nombre: " + this.nombre);
    }
    
    public String getApellido(){
    return apellido;
    }
    
    public void imprimirApellido(){
    System.out.println("Apellido: " + this.apellido);
    }
    
    public String getEmail(){
    return email;
    }
    
    public void imprimirEmail(){
    System.out.println("Email: " + this.email);
    }
    
    public void imprimir(){
    System.out.println("Datos del usuario: " + this.imprimirPerfil());
    }
    
} // Perfil
