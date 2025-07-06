import java.util.Scanner;

public class StudyCenter {
    private String name;
    private Group[] group = new Group[5];
    private int countArr = 0;
    private int countObj = 1;

    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
    Group groupStudent = new Group();
    Comments comments = new Comments();


    public void createGroup() {
        System.out.print("Guruh nomini kiriting: ");

        Group group1 = new Group(countObj++, scannerStr.nextLine());
        group[countArr++] = group1;
        seeGroup();
    }

    public void addStudentInGroup(int idGroup) {
        System.out.println(group[idGroup - 1].getName());

        while (true) {
            comments.AddStudentInGroup();
            switch (scannerInt.nextInt()) {
                case 1: //Add student
                    groupStudent.CreatStudent();
                    break;
                case 2:
                    groupStudent.removeStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Xatolik qayta urinib ko'ring");
                    break;
            }
        }


    }


    public void seeGroup() {
        for (int i = 0; i < countArr; i++) {
            System.out.println(group[i].getId() + ". " + group[i].getName());
        }
    }

    public StudyCenter(String name) {
        this.name = name;
    }


}
