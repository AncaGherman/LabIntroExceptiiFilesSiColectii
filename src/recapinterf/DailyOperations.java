package recapinterf;

public interface DailyOperations {
    public int operations(int...params);

    default void doSmth() {
        System.out.println("fac ceva");
    }

    static void ds() {
        System.out.println("corp");
    }
}
