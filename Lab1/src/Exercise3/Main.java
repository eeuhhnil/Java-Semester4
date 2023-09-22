package Exercise3;

public class Main {
    public static void main(String[] args){
        //task1//
        char c;
        for( c ='a'; c <= 'z'; c++)
                System.out.println(c);

        System.out.println();

        //task2
        long begin = new java.util.Date().getTime();
        int i = 0;
        for(i=0; i<=100000000; i++);
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);

        System.out.println();

        long begin1 = new java.util.Date().getTime();
        long i1 = 0;
        for(i1=0; i1<=100000000; i1++);
        long end1 = new java.util.Date().getTime();
        System.out.println(end1-begin1);


    }
}
