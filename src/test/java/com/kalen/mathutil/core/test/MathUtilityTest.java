/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kalen.mathutil.core.test;

import com.kalen.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DANG KHOI
 */
public class MathUtilityTest {

    //Test case #1 - Verify getFactorial(with n = 0)
    //Steps/Procedures
    //              1. Given n = 0
    //              2. Call/invoke getFactorial(n = 0)
    //Expected Result:
    //              The method must return 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ đến lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

//3 test case trên ko đẹp, bóc mùi, bad smells vì chỉ khác nhau phần data
// trong nghề kiểm thử, có 1 kĩ thuật đó là tách hẳn data kiểm thử ra 
// 1 chỗ, cho dễ nhìn, dễ quản lí đc data thiếu đủ hay ko

//sau đó, ta đưa bộ data này vào trong câu lệnh so sánh assert()
//Qua các tham số (Paramater)
//Tức là assertequal(expected, actual) là 2 tham số
//Ứng với bộ data đc tách ra
//                  120     5!
//                  720     6!
//                  24      4!
//                  6       3!
//                  ...
//                  Mảng [5][2] {0,1} {1,1} {2,2} {3,6} {5,120}
//Code nhìn gọn, phát hiện đc thiếu đủ test data, test case
//kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> đc gọi
//là ddt - DATA DRIVEN TESTING - Kiểm thử theo hướng tách data riêng lẽ
