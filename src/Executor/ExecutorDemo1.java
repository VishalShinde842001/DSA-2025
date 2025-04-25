package Executor;

public class ExecutorDemo1 {

    public static void main(String[] args) {
        operations();
    }


    public static void operations(){
        NewThread thread=null;
        for (long i=0;i<10000000L;i++){
            thread=new NewThread();
            System.out.println(i);
            thread.start();
        }
    }

}

//Multithreading normally can be achiveid by Extending Thread class or implementing the Runnable inerface

class NewThread extends Thread{
    @Override
    public void run(){
        System.out.println("This is thread");
    }
}
