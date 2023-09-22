public class GenericItem {
    public int ID;
    public String Name;
    public float Price;
    public Category.category category = Category.category.GENERAL;
    public GenericItem Analog=null;
    static int CurrentID = 0;

    public GenericItem( int id, String name, float price){
        ID=id;
        Name=name;
        Price=price;
    }
    //exercise1_1
    public GenericItem(String name, float price, Category.category category){
        this.ID = GenericItem.CurrentID++;
        Name=name;
        Price=price;
        this.category = Category.category.GENERAL;
    }

    public GenericItem(String name, float price, GenericItem analog){
        this.ID=GenericItem.CurrentID++;
        Name=name;
        Price=price;
        Analog=analog;
    }

    public GenericItem(){
    }

    void PrintAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f, category: %-10s \n", ID, Name, Price, category);
    }

    public boolean equals(GenericItem item){
        return super.equals(item) &&
                this.Name == item.Name &&
                this.ID == item.ID &&
                this.Price == item.Price;
    }
    public GenericItem clone () throws CloneNotSupportedException {
        return(GenericItem) super.clone();
    }
    public String toString(){
        return this.Name;
    }

}
