public class ArithmeticDemo {
    public static void main(String[] args) {
        // 宣告變數與值
        int x = 10;
        int y = 5;
 
        System.out.println("變數值...");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
 
        // 加法示範
        System.out.println("加法...");
        System.out.println("x + y = " + (x + y));
 
        // 減法示範
        System.out.println("減法...");
        System.out.println("x - y = " + (x - y));
 
        // 乘法示範
        System.out.println("乘法...");
        System.out.println("x * y = " + (x * y));
 
        // 除法示範
        System.out.println("除法...");
        System.out.println("x / y = " + (x / y));
 
        // 模數運算
        System.out.println("計算餘數...");
        System.out.println("x % y = " + (x % y));

	//數值類型不同的狀況
	System.out.println(10 / 3); //還是會以都int結果出來
	System.out.println(10.0 / 3); //這結果才是想要的
	System.out.println(10 / 3.0); //這結果才是想要的
	System.out.println((double) 10 / 3); //這結果才是想要的
    }
}