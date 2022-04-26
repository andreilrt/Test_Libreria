package test_libreria;

import java.util.Scanner;

public class Persona {
    
    private String Nombre;
    private Scanner Input;
    
    public Persona() {
        Nombre = " ";
        Input = new Scanner(System.in);
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void PedirNombre() {
        System.out.print("Por favor, Digite su nombre: ");
        this.setNombre(Input.next());
    }
}
