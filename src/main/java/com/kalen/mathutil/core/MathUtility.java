/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalen.mathutil.core;


//class này chứa 1 loạt các hàm static dùng để làm thu viện cho các nơi khác/class khác 
public class MathUtility {
   
    public static final double PI = 3.14;
    //public const double Pi = 3.14; //C# ko cần static mà vẫn giống vì có chữ const ~ final
    //hàm tính n! = 1.2.3...n
    //0! = 1! = 1 - quy ước
    //ko tính đc giai thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //vậy 21! ko chứa trong long đc, tràn kiểu dữ liệu
    //quy ước < 0! và >20! NÉM NGOẠI LỆ, HOK TÍNH ĐC
    
    
    //5! = 1.2.3.4   .5
    //5! =       4! x 5 = 5 x 4!
    //N! = N x (N-1)! ĐẸ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                  BÚP BÊ NGA
    public static long getFactorial(int n) {
        
        if(n<0 || n>20) 
            throw new IllegalArgumentException("Invalid n. n must be 0...20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc sớm nếu có thể
        //Dùng Đệ quy
        return n * getFactorial(n-1);
    }
    // Kĩ thuật kiểm thử gọi là regression testing
    //                          Kiểm thử hồi quy - tes lại những thứ đã từng test
    // Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa vì
    // fix bug thì phải sửa code, sửa hàm
    // thêm hàm, thêm tính năng
    // tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
    // hàm đang ngon - màu xanh , nếu ta sửa hàm vì lí do gì đó
    // liệu rằng hàm, còn xanh hay ko, thì phải test lại
    // nếu test = tay, bằng log, thì cực kì tốn thời gian, mất sức
    // nếu code của ta có sẵn test script - code kiểm thử
    // ta chỉ việc run lại cái test script này
    // nếu hàm sửa ngon, nó phải ra màu xanh
    // nếu hàm sửa ko ngon, bị màu đỏ!!!
    // nhờ test script ta verify lại hàm 1 rất nhanh -> kiểm thử lại
    // thứ đã từng kiểm thử để đảm bảo nó còn ngon so với trước
    // khi sửa đc gọi là kiểm thử hồi quy - REGRESSION TESTING
    // Nhờ CI, hồi quy liên tục
    
    // Bài này mình thử hồi quy = cách sửa lại hàm theo thuật toán
    // Đệ quy - Recursion
    
    
//    public static long getFactorial(int n) {
//        
//        if(n<0 || n>20) 
//            throw new IllegalArgumentException("Invalid n. n must be 0...20");
//        
//        if (n == 0 || n == 1)
//            return 1; //kết thúc sớm nếu có thể
//        
//        long result = 1; //biến tích lũy, gom dồn việc nhân, biến con heo đất
//                         //acc / accumulation
//        //sống sót đến for, sure n = 2...20
//        for (int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
}
