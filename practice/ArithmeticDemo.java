public class ArithmeticDemo {
    public static void main(String[] args) {
        // �ŧi�ܼƻP��
        int x = 10;
        int y = 5;
 
        System.out.println("�ܼƭ�...");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
 
        // �[�k�ܽd
        System.out.println("�[�k...");
        System.out.println("x + y = " + (x + y));
 
        // ��k�ܽd
        System.out.println("��k...");
        System.out.println("x - y = " + (x - y));
 
        // ���k�ܽd
        System.out.println("���k...");
        System.out.println("x * y = " + (x * y));
 
        // ���k�ܽd
        System.out.println("���k...");
        System.out.println("x / y = " + (x / y));
 
        // �ҼƹB��
        System.out.println("�p��l��...");
        System.out.println("x % y = " + (x % y));

	//�ƭ��������P�����p
	System.out.println(10 / 3); //�٬O�|�H��int���G�X��
	System.out.println(10.0 / 3); //�o���G�~�O�Q�n��
	System.out.println(10 / 3.0); //�o���G�~�O�Q�n��
	System.out.println((double) 10 / 3); //�o���G�~�O�Q�n��
    }
}