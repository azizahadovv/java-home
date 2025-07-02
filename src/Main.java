import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.print("O'quv markazi nomini kiriting ");
        StudyCenter studyCenter = new StudyCenter(scannerStr.nextLine());
        Comments comments = new Comments();

        while (true) {
            comments.startProjectHead();
            switch (scannerInt.nextInt()) {
                case 1://Guruh yaratish
                    studyCenter.creatGroup();
                    studyCenter.seeGroup();
                    break;
                case 2://Talaba qo'shish
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