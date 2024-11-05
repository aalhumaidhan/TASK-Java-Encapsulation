public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Meshal");
        student.setGpa(3.0);
        student.setAge(25);
        System.out.println(student.toString());
        System.out.println(student.getGpaStatus());
    }
}