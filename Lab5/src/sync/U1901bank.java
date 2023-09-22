package sync;

public class U1901bank {

    public int intTo;
    public int intFrom = 200;

    public synchronized void calc(int intTransaction, long lngTimeout){
        System.out.println("Before thread " + Thread.currentThread().getName() + " From= " + intFrom + " To= " + intTo);
        intFrom-=intTransaction;
        try {
            Thread.sleep(lngTimeout);
        }
        catch( InterruptedException e) {
            e.printStackTrace();
        }
        intTo+=intTransaction;
        System.out.println("After thread " + Thread.currentThread().getName() + " From= " + intFrom + " To= " + intTo);
    }
}
