// Practical 9 - Multithreading
class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted");
            }
        }
    }
}

class CharacterPrinter extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Character: " + ch);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Character thread interrupted");
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        NumberPrinter numThread = new NumberPrinter();
        CharacterPrinter charThread = new CharacterPrinter();
        numThread.start();
        charThread.start();
    }
}
