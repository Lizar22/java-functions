public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(sustract(4,2));
        System.out.println(multiply(5,2));
        System.out.println(divide(6,2));
    }
    //Ejecuta aquí todos los métodos creados e imprime en la terminal.


//Define los métodos basándote en su doc comment.

/**
 * Function name: add
 *
 * @param number1 (double)
 * @param number2 (double)
 * @return (double)
 * <p>
 * Inside the function:
 * 1. sum 2 numbers
 */
    public static double add(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }

/**
 * Function name: subtract
 *
 * @param number1 (double)
 * @param number2 (double)
 * @return (double)
 *
 * Inside the function:
 * 1. subtract 2 numbers
 */
    public static double sustract(double number1, double number2) {
        double substracts = number1 - number2;
        return substracts;
    }

/**
 * Function name: multiply
 *
 * @param number1 (double)
 * @param number2 (double)
 * @return (double)
 *
 * Inside the function:
 * 1. multiply 2 numbers
 */
    public static double multiply(double number1, double number2) {
        double multiplication = number1 * number2;
        return multiplication;
    }

/**
 * Function name: divide
 *
 * @param number1 (double)
 * @param number2 (double)
 * @return (double)
 *
 * Inside the function:
 * 1. divide 2 numbers
 */
    public static double divide(double number1, double number2) {
        double division = number1 / number2;
        return division;
    }
}
