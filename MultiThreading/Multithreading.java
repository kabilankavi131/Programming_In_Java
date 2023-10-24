public class Multithreading extends Thread {
    int num;

    public Multithreading(int n) {
        this.num = n;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            //System.out.println(i + " from thread : " + num);
            System.out.println(i + " from thread : " + Multithreading.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}