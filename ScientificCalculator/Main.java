import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {
        try {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
 
    public double divide(double a, double b) {
        try {
            if (b == 0.0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public double squareRoot(double n) {
        try {
            if (n < 0) throw new ArithmeticException("Cannot find square root of negative number");
            return Math.sqrt(n);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                \n==========================================
                        SCIENTIFIC CALCULATOR MENU
                ==========================================
                1.  Addition       (int)
                2.  Addition       (double)
                3.  Subtraction    (int)
                4.  Subtraction    (double)
                5.  Multiplication (int)
                6.  Multiplication (double)
                7.  Division       (int)
                8.  Division       (double)
                9.  Square Root
                10. Power
                11. Sine
                12. Cosine
                13. Tangent
                0.  Exit
                "==========================================  
            """);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first integer: ");
                    int i1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int i2 = sc.nextInt();
                    System.out.println("Addition (int): " + calc.add(i1, i2));
                    break;

                case 2:
                    System.out.print("Enter first decimal: ");
                    double d1 = sc.nextDouble();
                    System.out.print("Enter second decimal: ");
                    double d2 = sc.nextDouble();
                    System.out.println("Addition (double): " + calc.add(d1, d2));
                    break;

                case 3:
                    System.out.print("Enter first integer: ");
                    int s1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int s2 = sc.nextInt();
                    System.out.println("Subtraction (int): " + calc.subtract(s1, s2));
                    break;

                case 4:
                    System.out.print("Enter first decimal: ");
                    double sd1 = sc.nextDouble();
                    System.out.print("Enter second decimal: ");
                    double sd2 = sc.nextDouble();
                    System.out.println("Subtraction (double): " + calc.subtract(sd1, sd2));
                    break;

                case 5:
                    System.out.print("Enter first integer: ");
                    int m1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int m2 = sc.nextInt();
                    System.out.println("Multiplication (int): " + calc.multiply(m1, m2));
                    break;

                case 6:
                    System.out.print("Enter first decimal: ");
                    double md1 = sc.nextDouble();
                    System.out.print("Enter second decimal: ");
                    double md2 = sc.nextDouble();
                    System.out.println("Multiplication (double): " + calc.multiply(md1, md2));
                    break;

                case 7:
                    System.out.print("Enter dividend (int): ");
                    int di1 = sc.nextInt();
                    System.out.print("Enter divisor (int): ");
                    int di2 = sc.nextInt();
                    System.out.println("Division: " + calc.divide(di1, di2));
                    break;

                case 8:
                    System.out.print("Enter dividend (decimal): ");
                    double dd1 = sc.nextDouble();
                    System.out.print("Enter divisor (decimal): ");
                    double dd2 = sc.nextDouble();
                    System.out.println("Division: " + calc.divide(dd1, dd2));
                    break;

                case 9:
                    System.out.print("Enter number: ");
                    double sqNum = sc.nextDouble();
                    System.out.println("Square Root: " + calc.squareRoot(sqNum));
                    break;

                case 10:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Power: " + calc.power(base, exp));
                    break;

                case 11:
                    System.out.print("Enter angle in degrees: ");
                    double sinAngle = sc.nextDouble();
                    System.out.printf("Sine: %.4f%n", calc.sine(sinAngle));
                    break;

                case 12:
                    System.out.print("Enter angle in degrees: ");
                    double cosAngle = sc.nextDouble();
                    System.out.printf("Cosine: %.4f%n", calc.cosine(cosAngle));
                    break;

                case 13:
                    System.out.print("Enter angle in degrees: ");
                    double tanAngle = sc.nextDouble();
                    System.out.printf("Tangent: %.4f%n", calc.tangent(tanAngle));
                    break;

                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}