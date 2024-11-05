public class Student {
    private String name;
    private int age;
    private double gpa;

    public String getGpaStatus() {
        if (gpa < 2.0) {
            return "Needs improvement.";
        } else if (gpa <= 3.0) {
            return "Good.";
        }
        return "Excellent!";
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA is not a valid number.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
