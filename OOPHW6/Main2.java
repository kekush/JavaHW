package OOPHW6;

public class Main2 {
    public static void main(String[] args) {


        Student student1 = new StudentBuilder().getInstance().getName("Петя").getHungry(true).getAverageMarks((byte)5).getClassNumber((byte)122).build();
        System.out.println(student1.toString());
    }
}
