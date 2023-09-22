package ru.billing.stocklist;

public class GenericItem {
    public enum Category{
        FOOD,PRINT,DRESS,GENERAL;
    }
    private Category category = Category.GENERAL;
    int Id;
    private String Name;
    private float Price;

    private GenericItem analog;

    private static int CurrentID = 0;

    public int getId(){
        return Id;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
         this.Name = Name;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category category){
        this.category=category;
    }

    public GenericItem getAnalog(){
        return analog;
    }

    public void setAnalog(GenericItem analog){
        this.analog = analog;
    }



    public GenericItem( int id, String name, float price){
        Id=id;
        Name=name;
        Price=price;
    }
    //exercise1_1
    public GenericItem(String name, float price, Category category){
        this.Id = GenericItem.CurrentID++;
        Name=name;
        Price=price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog){
        this.Id=GenericItem.CurrentID++;
        Name=name;
        Price=price;
        this.analog=analog;
    }

    public GenericItem(){
    }

    public String toString(){
        return Id + " "+  Name +" " + Price + " " + category;
    }
}
