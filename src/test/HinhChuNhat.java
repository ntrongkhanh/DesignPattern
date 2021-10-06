package test;

public class HinhChuNhat {
    private int canhA;
    private int canhB;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int canhA, int canhB) {
        this.canhA = canhA;
        this.canhB = canhB;
    }

    public final int tinhDienTich(){
        return canhA*canhB;
    }
    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }
}
