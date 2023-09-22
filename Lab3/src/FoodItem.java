import java.util.Date;

public class FoodItem extends  GenericItem{
    public Date dateOfIncome;
    public short expires;

    public FoodItem(FoodItem analog, String name, float price,Date date, short exp) {
        super(name, price, analog);
        this.category= Category.category.FOOD;
        dateOfIncome = date;
        expires = exp;
    }

    //exercise 1_1
    public FoodItem(String name, float price, short exp){
        this(null,name,price, new Date(),exp);

    }

    public FoodItem(String name){
        this(null,name, 0.0f,new Date(), (short) 0);

    }
    void PrintAll(){
        super.PrintAll();
        System.out.printf("Date Of Income:%s, Expires:%-10d \n",dateOfIncome, expires);
    }

    public boolean equals(FoodItem item){
        return super.equals(item) &&
                this.dateOfIncome == item.dateOfIncome &&
                this.expires == item.expires;

    }

    public FoodItem clone () throws CloneNotSupportedException {
        return(FoodItem) super.clone();
    }
    public String toString(){
        return this.Name;
    }
}
