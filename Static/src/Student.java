public class Student {
    private String name;
    private String lastName;
    private int indexNumber;
    public static int studentNumber = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Student() {
    }

    public Student(String name, String lastName, int indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        studentNumber++;
    }
}
