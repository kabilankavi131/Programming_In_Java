class Cakecounter {
    int count = 0;

    public synchronized void increment() {
        count += 1;
    }
}

class Team implements Runnable {
    Cakecounter counter;

    Team(Cakecounter c) {
        this.counter = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i += 1) {
            counter.increment();
        }
    }
}

public class synchronize {
    public static void main(String[] args) {
        Cakecounter c = new Cakecounter();
        Thread team1 = new Thread(new Team(c));
        Thread team2 = new Thread(new Team(c));
        team1.start();
        team2.start();
        try {
            team1.join();
            team2.join();
        } catch (Exception e) {

        }
        System.out.println(c.count);
    }
}
