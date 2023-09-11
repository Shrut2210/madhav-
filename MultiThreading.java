import java.util.Scanner;

public class MultiThreading
{
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        Thread t1 = new Thread(ft);
        t1.start();

        SecondThread st = new SecondThread();
        Thread t2 = new Thread(st);
        t2.start();


    }
}

class FirstThread implements Runnable
{
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Good Morning");
            }
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


class SecondThread implements Runnable
{
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Good Evening");
            }
            Thread.sleep(300);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}