public class RightTriangle {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int c = Math.max(num3, Math.max(num1, num2));
        int a = Math.min(num3, Math.min(num1, num2));
        int b = num1 + num2 + num3 - c - a;

        int firstStep = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        int secondStep = (int) Math.pow(c, 2);

        System.out.println(num1 > 0 && num2 > 0 && num3 > 0 && firstStep == secondStep);
    }
}
