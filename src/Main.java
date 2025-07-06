import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Comments comments = new Comments();
        Group group = new Group();

        System.out.print("O'quv markazi nomini kiriting ");
        StudyCenter studyCenter = new StudyCenter(scannerStr.nextLine());
        System.out.println("O'quv markazi yaratildi endi buyruplarni tanlang: ");

        while (true) {
            comments.startProjectHead();
            switch (scannerInt.nextInt()) {
                case 1://Guruh yaratish
                    studyCenter.creatGroup();

                    break;
                case 2://Talaba qo'shish

                    studyCenter.seeGroup();
                    System.out.print("Guruh ID'sini tanlang: ");
                    studyCenter.addStudentInGroup(scannerInt.nextInt());
                    break;
                case 3://Guruh o'chirish
                    break;
                default:
                    System.out.println("xato ma'lumot qaytadan urinib ko'ring");
                    break;
            }
        }
    }
}