class calculator {
    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int a, b;
            String op;
            if (args.length >= 3) {
                a = Integer.parseInt(args[0]);
                op = args[1];
                b = Integer.parseInt(args[2]);
            } else {
                System.out.print("First integer: ");
                a = sc.nextInt();
                System.out.print("Operator (+ - * /): ");
                op = sc.next();
                System.out.print("Second integer: ");
                b = sc.nextInt();
            }

            switch (op) {
                case "+" -> System.out.println("Result: " + add(a, b));
                case "-" -> System.out.println("Result: " + sub(a, b));
                case "*" -> System.out.println("Result: " + multiply(a, b));
                case "/" -> System.out.println("Result: " + divide(a, b));
                default -> System.out.println("Unknown operator: " + op);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}