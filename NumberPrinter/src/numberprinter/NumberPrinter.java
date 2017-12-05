package numberprinter;


public class NumberPrinter {

    private static void printNumbers(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // preserve interruption status
                break;
            }
        }
    }
    public static void main(String[] args){

        //int number=10;
        Thread t=new Thread();
        t.start();
        printNumbers(10);



    }
}
