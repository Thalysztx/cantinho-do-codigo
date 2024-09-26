public class no {

    private int info;
    private no proximo;

    //construtor

    public no(int info) {
        this.info = info;
        this.proximo = null;
    }

    //getter setter

    public int getInfo(){
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public no getProximo() {
        return proximo;
    }

    public void setProximo(no proximo) {
        this.proximo = proximo;
    }
}