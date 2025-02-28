package pkg1;

public class TestCalc {

    public static void main(String[] args) {

        TestCalc calc = new TestCalc();
        calc.addition(100, 200);
        calc.multiplication(500, 1000);
        calc.division(1000, 500);


    }

    public void addition(int a, int b) {
        int add = a + b;

        System.out.println("Sum of two numbers:" + add);


    }

    public void multiplication(int x, int y) {
        int mul = x * y;

        System.out.println("Multiplication of two numbers:" + mul);
    }

    public void division(int c, int d) {
        int div = c / d;
        System.out.println("Division of two numbers:" + div);


    }

}
