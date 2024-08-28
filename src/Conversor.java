import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor, introduzca una cantidad en euros y el programa le devolverá la conversión en US dólares americanos.");

        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();

        double dolares = 1.09 * euros; 

        System.out.println(euros + " euros equivalen a " + dolares + " US dolares"  );

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal (eurosString); 
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecmimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecmimal);

        System.out.println(euros + " euros equivalen " + dolaresBigDecimal.toString() + "dolares" );
    }
}
