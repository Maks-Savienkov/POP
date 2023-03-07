package cdu.edu.ua;

public class Main {
    public static void main(String[] args) {
        int threadCount = 12;
        Breaker breaker = new Breaker(threadCount);
        ThreadController threadController = new ThreadController(threadCount, breaker);

        new Thread(breaker).start();
    }
}