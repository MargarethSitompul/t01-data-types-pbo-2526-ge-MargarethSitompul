import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String soal = sc.next(); // membaca Soal1 / Soal2 / ...

        if (soal.equals("Soal1")) {
int a = sc.nextInt();
int b = sc.nextInt();

boolean overflow = false;

if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
    overflow = true;
}
if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
    overflow = true;
}

if (overflow) {
    System.out.println("OVERFLOW");
} else {
    System.out.println(a + b);
}

        
        } 
        else if (soal.equals("Soal2")) {
            double x = sc.nextDouble();
double y = sc.nextDouble();

float fSum = (float) x + (float) y;
double dSum = x + y;

double diff = Math.abs(dSum - fSum);

System.out.printf("%.6f\n", diff);

        } 
        else if (soal.equals("Soal3")) {
            int N = sc.nextInt();

Integer a = N;
Integer b = a;

a = a + 1;

System.out.println("==: " + (a == b));
System.out.println("equals: " + a.equals(b));

        } 
        else if (soal.equals("Soal4")) {
            String S = sc.next();

String a = S;
String b = new String(S);

a = a + "X";

System.out.println("==: " + (a == b));
System.out.println("equals: " + a.equals(b));

        } 
        else if (soal.equals("Soal5")) {
            String intStr = sc.next();
String doubleStr = sc.next();
String boolStr = sc.next();

int i = Integer.parseInt(intStr);
double d = Double.parseDouble(doubleStr);
boolean b = Boolean.parseBoolean(boolStr);

double result = i * d;

if (!b) {
    result = -result;
}

System.out.printf("%.2f\n", result);

        }

        sc.close();
    }
}

