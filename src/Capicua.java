import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int numeroOriginal = num;
        int inverso = 0;

        while (num > 0) {
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }

        if (numeroOriginal == inverso) {
            System.out.println("El número es un capicúa.");
        } else {
            System.out.println("El número no es un capicúa.");
        }
    }
}

//Este programa solicita al usuario que introduzca un número y luego utiliza un bucle while para calcular su número inverso, al igual que en el ejercicio anterior. Luego, se compara el número original con el número inverso para determinar si son iguales. Si lo son, se imprime que el número es un capicúa; de lo contrario, se imprime que no lo es.
//
//Espero que esto te sea útil.