public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Initiating sequence...");
            Thread.sleep(1500); // Dramatic 1.5 second pause

            System.out.println("Preparing system components...");
            Thread.sleep(2000); // 2 second pause

            System.out.println("...");
            Thread.sleep(1000);

            System.out.println("WARNING: Unconventional output detected.");
            Thread.sleep(1500);

            System.out.println("Project effect complete.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}
