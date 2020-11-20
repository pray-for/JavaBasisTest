package FoundationClass;

import java.util.Scanner;

/**
 * 输入练习
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
        String line = sc.nextLine();
        System.out.println("输入的字符串数据为：" + line);
    }
}
