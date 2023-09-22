public class  TechnicalItem extends  GenericItem{

    public short warranyTime;

    public TechnicalItem(int id, String name, float price, short time) {
        super(id, name, price);
        warranyTime=time;
    }

    void PrintAll(){
        super.PrintAll();
        System.out.printf("Warrany Time:%-5d", warranyTime);
    }

    public boolean equals(TechnicalItem item){
        return super.equals(item) &&
                this.warranyTime == item.warranyTime;
    }

    public TechnicalItem clone () throws CloneNotSupportedException {
        return(TechnicalItem) super.clone();
    }
    public String toString(){
        return this.Name;
    }
}
