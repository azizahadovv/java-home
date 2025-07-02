import java.util.Scanner;

public class StudyCenter {
    private String name;
    private Group[] group = new Group[5];
    private int countArr = 1;
    private int countObj = 1;

    Scanner scannerStr = new Scanner(System.in);

    public void creatGroup() {
        System.out.print("Guruh nomini Kiriting ");
        Group group1 = new Group(countObj++, scannerStr.nextLine());
        group[countArr++] = group1;


    }

    public void seeGroup() {
        for (int i = 0; i < countArr; i++) {
            System.out.println(group[i].getId()+ ". " + group[i].getName());
        }
    }


    public StudyCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }


}
