import java.util.Scanner;

public class SumaHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora base: ");
        int horaBase = sc.nextInt();
        System.out.print("Introduce los minutos base: ");
        int minutosBase = sc.nextInt();
        System.out.print("Introduce los segundos base: ");
        int segundosBase = sc.nextInt();

        System.out.print("¿Cuántas horas quieres sumar?: ");
        int horasSumar = sc.nextInt();
        System.out.print("¿Cuántos minutos quieres sumar?: ");
        int minutosSumar = sc.nextInt();
        System.out.print("¿Cuántos segundos quieres sumar?: ");
        int segundosSumar = sc.nextInt();

        int segundosTotalesBase = horaBase * 3600 + minutosBase * 60 + segundosBase;
        int segundosTotalesSumar = horasSumar * 3600 + minutosSumar * 60 + segundosSumar;
        int segundosTotalesResultado = segundosTotalesBase + segundosTotalesSumar;

        int horaResultado = segundosTotalesResultado / 3600 % 24;
        int minutosResultado = segundosTotalesResultado % 3600 / 60;
        int segundosResultado = segundosTotalesResultado % 60;

        System.out.println("La hora resultante es: " + String.format("%02d", horaResultado) + ":" +
                String.format("%02d", minutosResultado) + ":" + String.format("%02d", segundosResultado));
    }
}

//Este programa solicita al usuario la hora base (hora, minutos y segundos) y luego pregunta la cantidad de horas, minutos y segundos que se desean sumar. Luego, se realiza el cálculo de los segundos totales para ambas horas y se suman. A partir de los segundos totales resultantes, se calcula la hora, minutos y segundos correspondientes. La salida muestra la hora resultante en el formato "HH:MM:SS".
//
//Espero que esto te sea útil.