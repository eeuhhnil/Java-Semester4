package ru.billing.stocklist;

public class  TechnicalItem extends  GenericItem{

    public short getWarranyTime() {
        return warranyTime;
    }

    public void setWarranyTime(short warranyTime) {
        this.warranyTime = warranyTime;
    }

    private short warranyTime;

    public String toString(){
        return  super.toString() + " " + warranyTime;
    }

    public TechnicalItem(int id, String name, float price, short time) {
        super(id, name, price);
        warranyTime=time;
    }


    public boolean equals(TechnicalItem item){
        return super.equals(item) &&
                this.warranyTime == item.warranyTime;
    }

    public TechnicalItem clone () throws CloneNotSupportedException {
        return(TechnicalItem) super.clone();
    }
}
