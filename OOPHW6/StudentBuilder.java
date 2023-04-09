package OOPHW6;

public class StudentBuilder {

    private static StudentBuilder instance = null;

    Student obj;

    public StudentBuilder() {

    }

    public static StudentBuilder getInstance() {
        if (instance == null) instance = new StudentBuilder();
        instance.obj = new Student();
        return instance;
    }

    public StudentBuilder getName(String name) {
        obj.setName(name);
        return this;
    }

    public StudentBuilder getAge(int age) {
        obj.setAge(age);
        return this;
    }

    public StudentBuilder getAverageMarks(byte marks) {
        obj.setAverageMarks(marks);
        return this;
    }

    public StudentBuilder getHungry(boolean hungry) {
        obj.setHungry(hungry);
        return this;
    }

    public StudentBuilder getTeacher(String teacher) {
        obj.setTeacher(teacher);
        return this;
    }

    public StudentBuilder getFavSubject(String subject) {
        obj.setFavSubject(subject);
        return this;
    }

    public StudentBuilder getClassNumber(byte number) {
        obj.setClassNumber(number);
        return this;
    }

   public Student build(){
        return obj;
   }
}
