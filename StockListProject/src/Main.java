import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("------Exercise1------");
        GenericItem a = new GenericItem(1,"Fish", 2000);
        GenericItem b = new GenericItem(2,"Cake", 1000);
        GenericItem c = new GenericItem(3, "Chicken", 500);
        a.PrintAll();
        b.PrintAll();
        c.PrintAll();


        System.out.println("------Exercise2------");
        Date date = new Date();
        Date date1 =  new Date();
        FoodItem food1 = new FoodItem(4,"food1", 10, date ,  (short)3);
        FoodItem food2 = new FoodItem(5,"food2", 20,date1, (short)4);
        TechnicalItem tech1 = new TechnicalItem(6,"tech1", 30, (short) 4);
        TechnicalItem tech2 = new TechnicalItem(7,"tech2", 40, (short) 5);
        GenericItem Array[] = {food1, food2, tech1, tech2};
        for(GenericItem u : Array){
            u.PrintAll();
        }

        System.out.println("food1 == food2 - " + food1.equals(food2));
        System.out.println("food1 == food1 - " + food1.equals(food1));

        System.out.println("tech1 == tech2 - " + tech1.equals(tech2));

        FoodItem food1_clone = food1.clone();
        System.out.printf("food1==food1_clone -" + food1.equals(food1));
        System.out.println(food1.toString());
    }
}
