package test;

public class HinhVuong extends HinhChuNhat{
    private int canhC;

    public HinhVuong() {
    }

    public HinhVuong(int canhA, int canhB, int canhC) {
        super(canhA, canhB);
        this.canhC = canhC;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }
}
