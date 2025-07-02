public class Group {
    private int id;
    private String name;
    private Student[] student = new Student[5];
    private int count;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
