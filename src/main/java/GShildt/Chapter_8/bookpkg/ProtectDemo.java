package GShildt.Chapter_8.bookpkg;

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook eb[] = new ExtBook[5];

        eb[0] = new ExtBook("Test1", "Roma", 123, "Piter");
        eb[1] = new ExtBook("Test2", "Roma", 123, "Piter2");
        eb[2] = new ExtBook("Test3", "Roma", 123, "Piter3");
        eb[3] = new ExtBook("Test4", "Roma", 123, "Piter4");
        eb[4] = new ExtBook("Test5", "Roma", 123, "Piter5");


        for (int i = 0; i < eb.length; i++) eb[i].show();

        System.out.println("show all books Piter");

        for (int i = 0; i < eb.length; i++) {
            if (eb[i].getPublisher() == "Piter")
                System.out.println(eb[i].getPublisher());
        }

        eb[0].title = "Roma";

    }
}
