public class AutoBoxDemo{
    public static void main(String[] args) {
        Integer iRef1 = 100;
        Integer iRef2 = 100;
 
        if (iRef1 == iRef2) {
            System.out.println("iRef1 == iRef2");
        }
        else {
            System.out.println("iRef1 != iRef2");
        }
	
	Integer iRef3 = 200;
        Integer iRef4 = 200;
 	System.out.println("使用==");
        if (iRef3 == iRef4) {
            System.out.println("iRef3 == iRef4");
        }
        else {
            System.out.println("iRef3 != iRef4");
        }
	System.out.println("自動裝箱機制對於整數值 -128 到 127 之間的值,在裝箱為物件之後,會存在記憶體之中一直被重複使用,而對於-128 到 127 之外的值,則於執行時期運行到該段程式碼時,才建立一個新的物件。");
	
	System.out.println("使用equals");
	if (iRef1.equals(iRef2)) {
            System.out.println("iRef1 == iRef2");
        }
        else {
            System.out.println("iRef1 != iRef2");
        }
    }
}