/*package day8.BT1;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void mainMenu() {
        System.out.println("--- QUAN LY DANH BA ---");
        System.out.println("1. Them danh ba");
        System.out.println("2. Cap nhat ten danh ba");
        System.out.println("3. Xoa danh ba theo sdt");
        System.out.println("4. Xem toan bo danh ba");
        System.out.println("5. Thoat");

    }
    Map<Sodienthoai, List<NguoiDung>> listContact = new HashMap<>();
    private static void option1(Scanner in){
        // b1: nhap sdt
        System.out.print("\t Nhap sdt: ");
        String sdt = in.nextLine();

        //b2 kiemr tra sdt co chua
        if ()

        //b3: neu chua co thi nhap ten , co sdt roi-> da luu lien he

    }

    public static void main(String[] args) {



        //chuong trinh
        Scanner in = new Scanner(System.in);
        int option = -1;
        do {
            mainMenu();
            System.out.print("Nhap lua chon: ");
            try{
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e){
                System.out.println("Nhap sai dinh dang");
                continue;
            }
            if (option <1 || option >5){
                System.out.println("Lua chon khong hop le");
                continue;
            }
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    //in ra danh ba -> duyet map
                    for ()
                    break;
            }
        }
        while (option != 5);
        in.close();

    }
}
*/