import java.util.Scanner;

public class NumeroInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();
        int inverso = 0;
        while (num > 0) {
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }
        System.out.println("El número inverso es: " + inverso);
    }
}

//Este programa solicita al usuario que introduzca un número positivo, y luego utiliza un bucle while para calcular su número inverso. En cada iteración del bucle, se va multiplicando el número inverso por 10 y se le suma el resto de la división del número original entre 10, de manera que se va construyendo el número inverso de forma progresiva. Una vez que el número original ha sido completamente procesado, se imprime el número inverso resultante.
//
//Es importante tener en cuenta que este programa sólo funciona para valores positivos, y no utiliza métodos de la clase String, Integer o arrays, tal y como se especifica en el enunciado del ejercicio. Espero que te sea útil.