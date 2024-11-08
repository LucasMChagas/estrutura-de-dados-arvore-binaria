package Classes;

public class No {
    private long id;
    private No esq,dir;
    public No (long id, No esq, No dir){
        this.id = id;
        this.esq = esq;
        this.dir = dir;
    }

    public void setEsq(No no){
        this.esq = no;
    }
    public void setDir(No no){
        this.dir = no;
    }

    public long getId() {
        return this.id;
    }

    public No getDir() {
        return this.dir;
    }

    public No getEsq() {
        return this.esq;
    }
}
