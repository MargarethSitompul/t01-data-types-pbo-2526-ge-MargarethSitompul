import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {

            
            // ================= SOAL 1 =================
            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int res = a + b;

                if ((a ^ res) < 0 && (b ^ res) < 0) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(res);
                }
                break;
            }

            // ================= SOAL 2 =================
            case "Soal2": {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                float resFloat = (float) x + (float) y;
                double resDouble = x + y;
                double selisih = Math.abs(resFloat - resDouble);

                System.out.printf("%.6f%n", selisih);
                break;
            }

            // ================= SOAL 3 =================
            case "Soal3": {
                int n = sc.nextInt();

                Integer aObj = n;
                Integer bObj = aObj;

                aObj++; // Integer immutable → objek baru

                System.out.println("==: " + (aObj == bObj));
                System.out.println("equals: " + aObj.equals(bObj));
                break;
            }

            // ================= SOAL 4 =================
            case "Soal4": {
                String s = sc.next();

                String a = s;
                String b = new String(s);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // ================= SOAL 5 =================
            case "Soal5": {
                int valInt = Integer.parseInt(sc.next());
                double valDouble = Double.parseDouble(sc.next());
                boolean valBool = Boolean.parseBoolean(sc.next());

                double result = valInt * valDouble;
                if (!valBool) result *= -1;

                System.out.printf("%.2f%n", result);
                break;
            }

            // ================= DEFAULT =================
            default:
                // Tidak perlu output tambahan sesuai spesifikasi soal
                break;
        }

        sc.close();
    }
}