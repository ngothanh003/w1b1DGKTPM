/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addition;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        // Nhận giá trị đầu vào từ người dùng
        int num1 = scanner.nextInt();

        System.out.println("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        // Tính tổng của hai số
        int sum = num1 + num2;

        // Hiển thị kết quả
        System.out.println("Tong hai so la: " + sum);
        
        // Đóng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}

