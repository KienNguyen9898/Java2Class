package day8.BT1;

public class NguoiDung {
    private String name;

    public NguoiDung() {
    }

    public NguoiDung(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "name='" + name + '\'' +
                '}';
    }

}
