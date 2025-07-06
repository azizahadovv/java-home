import java.util.Scanner;

public class Group {
    private int id;
    private String name;
    private Student[] student = new Student[5];
    private int count;
    private int studentCount = 1;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);


    void CreatStudent() {
        showStudent();
        System.out.print("Talaba to'liq nomini kiriting ");
        Student student1 = new Student(studentCount++, scannerStr.nextLine());
        student[count++] = student1;
        System.out.println("Talaba muvaffaqiyatli qo'shildi");
    }


    public void removeStudent() {
        showStudent();
    }


    void showStudent() {
        System.out.println("Talabalar ro'yxati: ");
        for (int i = 0; i < count; i++) {
            System.out.println(student[i].getId() + "." + student[i].getFullName());
        }
    }


    Group() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
