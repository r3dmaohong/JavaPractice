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
 	System.out.println("�ϥ�==");
        if (iRef3 == iRef4) {
            System.out.println("iRef3 == iRef4");
        }
        else {
            System.out.println("iRef3 != iRef4");
        }
	System.out.println("�۰ʸ˽c�������ƭ� -128 �� 127 ��������,�b�˽c�����󤧫�,�|�s�b�O���餧���@���Q���ƨϥ�,�ӹ��-128 �� 127 ���~����,�h�����ɴ��B���Ӭq�{���X��,�~�إߤ@�ӷs������C");
	
	System.out.println("�ϥ�equals");
	if (iRef1.equals(iRef2)) {
            System.out.println("iRef1 == iRef2");
        }
        else {
            System.out.println("iRef1 != iRef2");
        }
    }
}