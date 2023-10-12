/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kalen.mathutil.main;

import com.kalen.mathutil.core.MathUtility;

/**
 *
 * @author DANG KHOI
 */
public class Main {

    public static void main(String[] args) {
        //Test case #1 - Xem chi tiết bên dưới
        int n = 0; // given n = 0; ý muốn tính 0!
        long expected = 1;
        long actual = MathUtility.getFactorial(n); //ý nói rằng hàm chạy ra mấy, invoke, call

        //so sánh giữa expected vs actual 
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        
        //Test case #2 - N = 1 -> Xem chi tiết mô tả bên dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
       //Test case #2 - N = 1 -> Xem chi tiết mô tả bên dưới
        System.out.println("5! -> expected: 120"
                + " | actual = " + MathUtility.getFactorial(5));
        
    }

    //TEST CASE #2: Verify getFactorial(with n = 1)
    //STEPS/PROCEDURES:
    //      1. Given n = 1
    //      2. Call/invoke getFactorial(n = 1)
    
    //EXPECTED RESULT:
    //              the method must return 1 in case of 1!
    //STATUS: PASSED | FAILED
   
    //TEST CASE #3: Verify getFactorial(with n = 5)
    //STEPS/PROCEDURES:
    //      1. Given n = 5
    //      2. Call/invoke getFactorial(n = 5)
    
    //EXPECTED RESULT:
    //              the method must return 120 in case of 5!
    //STATUS: PASSED | FAILED
    
    //Mình là DEV, Mình phải test code của mình ngon trước đã
    //Muốn test code (DEV) hay là test app (QC/Tester) thì cần phải chuẩn bị
    //Test case - tình huống kiểm thử, trường hợp kiểm thử - cách ta kiểm thử trong 1 ngữ cảnh nào đó
    //                                                     - Bàn về bộ data
    //1 Test case có cấu trúc như sau:
    //ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed)
    //DEV em muốn kiểm thử coi hàm chính em viết đúng hay sai
    //thì em phải thiết kế các test case
    //Test Case #1: Verify getFactorial(with n = 0)
    //Steps-Procedures: [Các bước run app để test]
    //      1.Given n = 0
    //      2.Execute/Call/Invoke function getFactorial(0)
    //Expected Result: the function must return 1 (standing for 0! = 1)
    //Status: PASSED or FAILED. ai biết. chờ run app/hàm cái đã!!!
    //RUN hàm RUN app, đưa test data vào, thì đc gọi là TEST RUN

}
