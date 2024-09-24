import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroGenerados = new Random().nextInt(100);
        int intento = 0;

        while(intento < 5){
            System.out.print("introduzca el numero de 0 a 100");
            int numeroDeUsuario = lector.nextInt();
            intento++;

            if(numeroGenerados == numeroDeUsuario){
                System.out.println("FELICIDADES ADIVINO EN ESTOS INTENTOS: " + intento + "INTENTOS!" );
                break;
            } else if (numeroGenerados < numeroDeUsuario) {
                System.out.println("el numero es menor");
            }else {
                System.out.println("el numero es mayor");
            }
        }
        if (intento == 5){
            System.out.println("lo siento no conseguiste adivinar el numero");
        }
    }
}