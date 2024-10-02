public class Calculadora {
    public static void main(String[] args) {

        char r;
        double num1, num2;

        do {
            System.out.println("Introduce el primer número: ");
            num1 = Double.parseDouble(System.console().readLine());
            System.out.println("Introduce el segundo número: ");
            num2 = Double.parseDouble(System.console().readLine());

            System.out.println("¿Que quieres calcular? (Suma, Resta, Multiplicación, División (1-4))");
            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los dos números es: " + (num1 + num2));                
                    break;
                case 2:
                    System.out.println("La resta de los dos números es: " + (num1 - num2));                
                    break;
                case 3:
                    System.out.println("La multiplicación de los dos números es: " + (num1 * num2));                
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por 0");
                    } else {
                        System.out.println("La división de los dos números es: " + (num1 / num2));                
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("¿Quieres hacer otra operación? (s/n)");
            r = System.console().readLine().charAt(0);

            while (r != 's' && r != 'n') {
                System.out.println("Opción no válida");
                System.out.println("¿Quieres hacer otra operación? (s/n)");
                r = System.console().readLine().charAt(0);
            }

            
        } while (r == 's');
    }
}
