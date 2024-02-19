public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double R = 6371.0;

        double a = (x2 - x1) / 2;
        double b = (y2 - y1) / 2;

        double sinA = Math.sin(a);
        double sinB = Math.sin(b);
        double cosX2 = Math.cos(x2);
        double cosX1 = Math.cos(x1);

        double d = cosX2 * cosX1 * Math.pow(sinB, 2);
        double c = Math.pow(sinA, 2);
        double sum = c + d;

        double sqrt = Math.sqrt(sum);

        double distance = 2 * R * Math.asin(sqrt);

        System.out.println(distance + " kilometers");
    }
}
