/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdemo;

/**
 *
 * @author GRU-PC
 */
public class Test {
    
    int n;
    int i;
    long a;
    String str;
    String str1 = Integer.toString(n);
    String str2 = Integer.toString(i);
    public Test(){
        
    }
    public Test(int a, int b){
        this.n = a;
        this.i =b;
    }
    public Test(int n){
        this.n =n;
    }
    //Contructor tao tu mot string
    public Test (String init){
        this.str = init;
    }
   
    //Tạo một số từ kiểu long
    public Test(long n){
        this.a =n;
    }
    //Hàm biểu diễn kiểu String của một số.
    public String toString(){
        return String.valueOf(this.n);
    }
    //Hàm trả về kiểu String của long/
    public String toLong(){    
        return String.valueOf((long) n);
    }
//get Tong
    public int getAdd(){
        return (i+n);
    }
    //get hieu
    public int getSubtract(){
        return (n-i);
    }
    //tra ve dang equals
    public boolean equals(){
        return str1.equals(str2);
    }
    //compareTO
    public int compareTo(){
        return str1.compareTo(str2);
    }
    //Tra ve clone;
   public Test clone(Test t) throws CloneNotSupportedException{
       return (Test) super.clone();
   }
}
