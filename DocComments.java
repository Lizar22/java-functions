public class DocComments {

    //Para documentar un método se toman en cuenta, el nombre de la función, los parámetros con su tipo de dato, lo que devuelve con su tipo de dato y lo que hace la función. Mira estos ejemplos y resuelve el ejercicio final. 
    
    //Si escribes primero la función y luego sobre ella escribes /** */ te saldrá automáticamente la plantilla de documentación.
    
    public static void main(String[] args) {
        greeting();
        greetingCoder("Alex", 155, 44.50);
        double bmi = calculateBodyMassIndex(1.55, 44.50);
        System.out.println(bmi);
        //Ejecuta el nuevo método
        System.out.println(result(bmi));
    }
    /**
     * Function name: greeting
     * 
     * Inside the function:
     * 1. prints "Hola FemCoder"
     * 
     */
    public static void greeting(){
        System.out.println("Hola FemCoder");
    }

    /**
     * Function name: greetingCoder
     * 
     * @param name (String)
     * @param height (double)
     * @param weight (double)
     * 
     * Inside the function:
     * 1. print the name the height and the weight as part of a text
     */

    public static void greetingCoder(String name, double height, double weight){
        System.out.println("Hola mi nombre es " + name + " mido " + height + " cm y peso " + weight + " kg" );
    }

    /**
     * Function name: calculateBodyMassIndex
     * 
     * @param height (double)
     * @param weight (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. calculates the weight in kilograms by the squared height in meters and return it.
     */

    public static double calculateBodyMassIndex(double height, double weight){
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    //Escribe una función que con el índice de masa corporal devuelva un String con los resultados y documéntala:
    
    /* Clasificación índice de masa corportal rango - kg/m2
    Rango 1	< 16
    Rango 2	16 - 17
    Rango 3	17 - 18.5
    Rango 4	18.5 - 25
    Rango 5	25 - 30
    Rango 6	30 - 35
    Rango 7	35 - 40
    Rango 8	> 40 */

    /**
     *  Function name: result
     *
     * @param bmi (double)
     * @return (double)
     *
     * Inside the function:
     * 1. Classify BMI according to the ranges established from 1 to 8
     * 2. Returns a message with the corresponding range
     */
    public static String result(double bmi) {
        if (bmi < 16) {
            return "Rango 1";
        } else if (bmi >= 16 && bmi <= 17) {
            return "Rango 2";
        } else if (bmi <= 18.5) {
            return "Rango 3";
        } else if (bmi <=25) {
            return "Rango 4";
        } else if (bmi <= 30) {
            return "Rango 5";
        } else if (bmi <= 35) {
            return "Rango 6";
        } else if (bmi <= 40) {
            return "Rango 7";
        } else {
            return "Rango 8";
        }
    }
}
