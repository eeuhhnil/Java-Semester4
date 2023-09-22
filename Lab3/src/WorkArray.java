public class WorkArray <T extends Number> {
    public T[] arrNums;

    public WorkArray(T[] numP){
        this.arrNums=numP;
    }
    public double Sum(){
        double sum=0;
        for(T num : arrNums ){
            sum += num.doubleValue();
        }
        return sum;
    }

    public void Print(){
        for( T num : arrNums){
            System.out.print(num);
        }
        System.out.println();
    }
}
