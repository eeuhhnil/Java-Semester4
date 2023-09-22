import java.util.Date;

public class FoodItem extends  GenericItem{
    public Date dateOfIncome;
    public short expires;

    public FoodItem(int id, String name, float price,Date date, short exp) {
        super(id, name, price);
        dateOfIncome = date;
        expires = exp;
    }
    void PrintAll(){
        super.PrintAll();
        System.out.printf("Date Of Income:%s, Expires:%-5d \n",dateOfIncome, expires);
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
