package OOPHW6;

public class Student {

    private String name;
    private byte averageMarks;
    private String teacher;
    private int age;
    private String favSubject;
    private boolean hungry;
    private byte classNumber;


    public void setName(String name) {
        this.name = name;
    }

    public void setAverageMarks(byte averageMarks) {
        this.averageMarks = averageMarks;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavSubject(String favSubject) {
        this.favSubject = favSubject;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setClassNumber(byte classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        String line = "";
        String line3 = "";
        String line4 = "";
        String line5 = "";
        String line6 = "";
        String line7 = "";
        String line8 = "";
        if (hungry) line = "Я голодный. ";
        if (name != null) line3 = "Меня зовут " + name + ". ";
        if (teacher != null) line4 = "Мой учитель " + teacher + ". ";
        if (favSubject != null) line5 = "Я люблю " + favSubject + ". ";
        if (age != 0) line6 = "Мой возраст " + age + ". ";
        if (averageMarks != 0) line6 = "Я обычно учусь на " + averageMarks + ". ";
        if (classNumber != 0) line7 = "Сейчас я в классе номер " + classNumber + ". ";
        return line + line3 + line4 + line5 + line6 + line7 + line8;
    }
}
