package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;

    private short expires;

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public Date getDateOfIncome(){
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome){
        this.dateOfIncome = dateOfIncome;
    }

    public FoodItem(FoodItem analog, String name, float price,Date date, short exp) {
        super(name, price, analog);
        this.setCategory(GenericItem.Category.FOOD);
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

    public boolean equals(FoodItem item){
        return super.equals(item) &&
                this.dateOfIncome == item.dateOfIncome &&
                this.expires == item.expires;

    }

    public FoodItem clone () throws CloneNotSupportedException {
        return(FoodItem) super.clone();
    }
    public String toString(){
        return super.toString() +" "+  expires + " "+ dateOfIncome;
    }
}
