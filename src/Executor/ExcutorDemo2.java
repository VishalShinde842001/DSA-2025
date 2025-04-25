package Executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorDemo2 {

    public static void main(String[] args) {
        operations();
    }

    public static void operations() {
        Callable<String> stringCallable = () -> "Hey Vishal Good Morninig";

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            service.submit(stringCallable);
        } finally {
            service.shutdown();
        }


    }
}
