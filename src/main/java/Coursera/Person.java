package Coursera;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isASleep(int hr) {
        return 22 < hr || hr > 7;
    }

    public String toString() {
        return name;
    }

    public void status(int hr) {
        if (this.isASleep(hr))
            System.out.println("Now offline " + this);
        else
            System.out.println("Now online " + this);
    }
}




    //###################### 3 ############################
//    private String name;
//
//    Person (String n){
//        this.name = n;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String toString() {
//        return this.getName();
//    }

    //###################### 3 ############################
    //###################### 1 ############################
//    private String name;
//    public Person(String n){
//        this.name = n;
//        System.out.println("#1 ");
//    }
//###################### 1 ############################

    //###################### 2 ############################
//    private String name;
//
//    public Person(String n) {
//        super();
//        this.name = n;
//    }
//
//    public void setName(String n) {
//        this.name = n;
//    }
    //###################### 2 ############################



