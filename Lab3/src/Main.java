import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        System.out.println("---------TASK1----------");
        GenericItem a = new GenericItem("a", 100, Category.category.GENERAL);
        GenericItem b = new GenericItem("b", 99, a);
        GenericItem c = new GenericItem();
        a.PrintAll();
        b.PrintAll();
        c.PrintAll();

        Date date = new Date();
        FoodItem food1 = new FoodItem("food1", 200,(short) 1);
        FoodItem food2 = new FoodItem(food1, "food2", 100, date, (short)2);
        FoodItem food3 = new FoodItem("food3");
        food1.PrintAll();
        food2.PrintAll();
        food3.PrintAll();



        System.out.println("------TASK2------");

        Integer[] intArr = { 10,20,15};
        Float[] floatArr= new Float[5];

        for (int i = 0; i < 5; i++) {
            floatArr[i] = 0.5f+i;
        }
        WorkArray<Integer>  insWorkArrayInt = new WorkArray<>(intArr);
        WorkArray<Float> insWorkArrayFloat = new WorkArray<>(floatArr);

        insWorkArrayFloat.Print();
        insWorkArrayInt.Print();

        System.out.println(insWorkArrayFloat.Sum());
        System.out.println(insWorkArrayInt.Sum());

        String line = "Candy 'Mask';45;120";
        String[] item_ild = line.split(";");

        String name = item_ild[0];
        float price = Float.parseFloat(item_ild[1]);
        short exp = Short.parseShort(item_ild[2]);
        FoodItem fooditem = new FoodItem(name,price,exp);
        fooditem.PrintAll();
    }
}
