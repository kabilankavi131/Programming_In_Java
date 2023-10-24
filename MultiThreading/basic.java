class basic {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
         Multithreading m= new Multithreading(i);
            m.start();
        }

    }
}