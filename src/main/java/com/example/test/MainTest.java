package com.example.test;
//import java.util.Scanner;   //引入Scanner包
//
//public class MainTest {
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入一个三位数");
//            int n = sc.nextInt();
//
//            // 核心代码部分
//
//            int n1 = n / 100;
//            int n2 = (n % 100) / 10;
//            int n3= n % 10;
//
//            // if判断是否相等
//
//            if(n < 1000 && n > 99){   //判断是否为三位数
//                if(n ==(n1*n1*n1 + n2*n2*n2 + n3*n3*n3)){
//                    System.out.println("这个数是水仙花");
//                }
//                else{
//                    System.out.println("这个数不是水仙花数");
//                }
//            }else{                    //不是三位数则输出有误
//                System.out.println("输入有误，请重新输入");
//}}}

       //具有私有访问权限，只能类内部访问

public class MainTest {
    public static void main(String[] args) {
        int target = 3, result;
//        具体实现
        int a=1,b=1,tmp;
        for (int i =1 ; i<target; i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        result = a;
        System.out.println(result);

    }

}



