public class GenericItem {
    public int ID;
    public String Name;
    public float Price;
    public Category.category category = Category.category.GENERAL;

    public GenericItem( int id, String name, float price){
        ID=id;
        Name=name;
        Price=price;
    }

    void PrintAll() {
        System.out.printf("ID: %d , Name: %-5s , price:%5.2f, category: %-5s \n", ID, Name, Price, category);
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
