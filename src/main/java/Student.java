/**
 int ...marks -передаем большое количество оценок
 */
public class Student {
    private String fullName;
    private String bDate;
    private int[] marks;

    //будем сериализовывать, нужен будет конструктор по умолчанию
    protected Student() {

    }

    public Student(String fullName, String bDate, int... marks) {
        this.fullName = fullName;
        this.bDate = bDate;
        this.marks = marks;
    }

    public Student(String fullName) {
        this(fullName, null);
    }


}
