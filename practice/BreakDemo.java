public class BreakDemo{
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int score = 0;
        int sum = 0;
        int count = -1;
        while (true){
            count++;
            sum += score;
            System.out.print("��J����(-1 ����):");
            score = scanner.nextInt();
 
            if (score == -1){
                break;
            }
        }
        System.out.println("����:" + (double) sum / count);
 
    }
}