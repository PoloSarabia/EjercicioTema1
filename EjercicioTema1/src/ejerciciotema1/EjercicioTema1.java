/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema1;

/**
 *
 * @author mpolo
 */
public class EjercicioTema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	byte number1 = 1; //1 byte
	short number2 = 2; //2 byte
	int number3 = 3; //4 byte
	long number4 = 491755; //8 byte

	float decimal1 = 4.9f;
	double decimal2 = 9.99d;

	char caracter1= 'a';
        String nombre = "Nombre en texto";

	boolean verdadero = true;
	boolean falso = false;

	
        
        System.out.println("Byte: "+ number1);
        System.out.println("Short: "+ number2);
        System.out.println("int: "+ number3);
        System.out.println("Long: "+ number4);
        System.out.println("Float: "+ decimal1);
        System.out.println("double: "+ decimal2);
        System.out.println("char: "+ caracter1);
        System.out.println("boolean true: "+ verdadero);
        System.out.println("boolean false: "+ falso);
        System.out.println("String: "+ nombre);

    }
    
}
