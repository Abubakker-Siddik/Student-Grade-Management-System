class Student {
    String name;
    int id;
    double marks1, marks2, marks3;

    Student(String name, int id, double marks1, double marks2, double marks3) {
        this.name = name;
        this.id = id;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }

    public void getGrade(double avgM) {
        if(avgM >= 90){
            System.out.println("Grade: A");
        } else if(avgM >= 75){
            System.out.println("Grade: B");
        } else if(avgM >= 50){
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    public void displayDetails() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
        double avgM = calculateAverage();
        System.out.println("Average Marks: " + avgM);
        getGrade(avgM);
        System.out.println();
    }
}
