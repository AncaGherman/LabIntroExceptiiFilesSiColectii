package colectii;

public class Test {
    public static void main(String[] args) {
        int sold = 1000;
        boolean autentificat = true;
        if (autentificat && sold > 0) {
            System.out.println("Operatia este posibila");
        }
        else {
            System.out.println("Operatia nu este posibila");
        }
    }
}
