package day8.functional;

public class Main {
    public static void main(String[] args) {
        MyFuntional sum = new MyFuntional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };
        System.out.println("Tong 3 va 5 = "+ sum.calculator(3.0, 5.0));

        //dinh nghia 1 phuong thuc tinh bieu thuc
        //A = 5*a +3*b -10
        MyFuntional A = new MyFuntional() {
            @Override
            public double calculator(double a, double b) {
                return 5*a + 3*b - 10;
            }
        };
        System.out.println("A = "+ A.calculator(1.0,2.0));
    }
    //Thuong ket hop voi stream api va lambda expression
}
