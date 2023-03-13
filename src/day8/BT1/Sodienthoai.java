package day8.BT1;

public class Sodienthoai {
    private String sdt;

    public Sodienthoai() {
    }

    public Sodienthoai(String sdt) {
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Sodienthoai{" +
                "sdt='" + sdt + '\'' +
                '}';
    }
}
