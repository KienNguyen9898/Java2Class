package day8.BT2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String a1 = " Hello jAVA class";
    // dem so ki tu trong chuoi
        Bt2Functional demKiTu = a -> a.length();
        System.out.println("So ki tu trong chuoi= "+demKiTu.chuoi(a1));

    // tinh so tu trong chuoi
        //khi nao bd 1 tu? i la khoang trang, i+1 khong phai la khoang trang
        Bt2Functional demTu = a -> {
            int count = 0;
            if (a.charAt(0) != ' '){
                count++;
            }
            for (int i=1; i<a.length(); i++){
                if (a.charAt(i) == ' ' && a.charAt(i+1) != ' '){
                    count++;
                }
            }
            return count;
        };
        System.out.println("So tu = "+ demTu.chuoi(a1));

        //dem so tu 'a' , 'A' trong chuoi.
        Bt2Functional demTuA = a -> {
            int count = 0;
            if (a.charAt(0) == 'a' || a.charAt(0)=='A'){
                count++;
            }
            for (int i=1; i<a.length();i++){
                if (a.charAt(i) == 'a' || a.charAt(i) == 'A'){
                    count++;
                }
            }
            return count;

        };
        System.out.println("So ki tu 'a', 'A'= "+demTuA.chuoi(a1));

        // dem so ki tu trong chuoi chi xuat hien 1 lan
        Bt2Functional demKiTuSD = a -> {
            Set<Character> characters = new HashSet<>();
            for (int i = 0; i <a.length(); i++){
                characters.add(a.charAt(i));
            }
            return characters.size();
        };
        System.out.println("So ki tu da dung = "+ demKiTuSD.chuoi(a1));




    }
}
