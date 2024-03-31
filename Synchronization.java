public class Synchronization {
    static class Table {
        synchronized void printTable(int n) {
            for (int i = 1; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    static class Thred1 extends Thread {
        Table t;

        public Thred1(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(5);
        }
    }


    static class Thred2 extends Thread {
        Table t;

        public Thred2(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable(100);
        }
    }

    static class TestSynchronization {
        public static void main(String[] args) {
            Table t = new Table();

            Thred1 t1 = new Thred1(t);
            Thred2 t2 = new Thred2(t);

            t1.start();
            t2.start();
        }
    }
}
