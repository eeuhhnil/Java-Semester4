package Exercise5;

public class Main5_1 {
    public static void  main(String[] args){
        int Mas[] = {1,2,3,4,5,6,7,8};
        int Max  = Mas[0];
        for(int num : Mas){
            if (num > Max){
                Max = num;
            }
        }
        System.out.println(Max);
    }
}
