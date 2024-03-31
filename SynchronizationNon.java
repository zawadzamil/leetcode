public class SynchronizationNon {
    static class Table {
        synchronized void printTable(String s) {
            for (int i = 1; i < 100; i++) {
                System.out.printf("Running Thread on %s value: %d%n", s, i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        void modifyTable(String s) {
            System.out.println("Modifying data using thread " + s);
        }
    }

    static class Thred1 extends Thread {
        Table t;

        public Thred1(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable("Thread 1");
        }
    }


    static class Thred2 extends Thread {
        Table t;

        public Thred2(Table t) {
            this.t = t;
        }

        public void run() {
            t.modifyTable("Thread 2");
        }
    }

    static class Thred3 extends Thread {
        Table t;

        public Thred3(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable("Thread 3");
        }
    }

    static class Thred4 extends Thread {
        Table t;

        public Thred4(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable("Thread 4");
        }
    }

    static class Thred5 extends Thread {
        Table t;

        public Thred5(Table t) {
            this.t = t;
        }

        public void run() {
            t.printTable("Thread 5");
        }
    }

    static class TestSynchronization {
        public static void main(String[] args) {
            Table t = new Table();

            Thred1 t1 = new Thred1(t);
            Thred2 t2 = new Thred2(t);
            Thred3 t3 = new Thred3(t);
            Thred4 t4 = new Thred4(t);
            Thred5 t5 = new Thred5(t);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }
}
