package sync;

public class U1901Thread extends  Thread{
    public U1901bank getBankWork() {
        return bankWork;
    }

    public void setBankWork(U1901bank bankWork) {
        this.bankWork = bankWork;
    }

    private U1901bank bankWork;

    public int getIntTrans() {
        return intTrans;
    }

    public void setIntTrans(int intTrans) {
        this.intTrans = intTrans;
    }

    private int intTrans;

    public long getLngSleep() {
        return lngSleep;
    }

    public void setLngSleep(long lngSleep) {
        this.lngSleep = lngSleep;
    }

    private long lngSleep;

    public U1901Thread(U1901bank bankWork, int intTrans, int lngSleep) {
        this.bankWork = bankWork;
        this.intTrans = intTrans;
        this.lngSleep = lngSleep;
    }

    public void run(){
        this.getBankWork().calc(this.getIntTrans(), this.getLngSleep());
    }
}
