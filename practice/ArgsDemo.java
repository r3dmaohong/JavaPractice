public class ArgsDemo{
    public static void main(String[] args) {
        System.out.println("顯示命令列引數..");
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}