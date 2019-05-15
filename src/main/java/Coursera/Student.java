package Coursera;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public boolean isASleep(int hr) {
        return 22 < hr && hr > 8;
    }

    //###################### 3 ############################

//   private int studentID;
//
//    Student(String n,int i) {
//        super(n);
//        this.studentID=i;
//    }
//
//
//    public int getStudentID() {
//        return studentID;
//
//    }
//
//    public String toString() {
////        return this.getStudentID()+ ": "+this.getName();
//        return this.getStudentID()+ ": "+super.toString();
//
//    }
    //###################### 3 ############################

    //###################### 1 ############################
//    public Student(){
//        this ("Student");
//        System.out.println("#2 ");
//    }
//
//
//public Student(String n){
//    super(n);
//    System.out.println("#3 ");
//}

    //###################### 1 ############################
    //###################### 2 ############################
//public Student () {
//    this.setName("Student");
    //###################### 2 ############################
}


