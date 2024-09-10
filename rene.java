import java.util.Scanner;

public class rene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de experiencias educativas: ");
        int numMaterias = sc.nextInt();

        double[] calificaciones = new double[numMaterias];
        int[] creditos = new int[numMaterias];

        for (int i = 0; i < numMaterias; i++) {
            System.out.print("Ingrese la calificación de la experiencia educativa " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            System.out.print("Ingrese los créditos de la experiencia educativa " + (i + 1) + ": ");
            creditos[i] = sc.nextInt();
        }

        double promedioPonderado = calcularPromedioPonderado(calificaciones, creditos);

        System.out.println("El promedio ponderado es: " + promedioPonderado);
    }

    public static double calcularPromedioPonderado(double[] calificaciones, int[] creditos) {
        double sumaPonderada = 0;
        int sumaCreditos = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            sumaPonderada += calificaciones[i] * creditos[i];
            sumaCreditos += creditos[i];
        }

        return sumaPonderada / sumaCreditos;
    }
}