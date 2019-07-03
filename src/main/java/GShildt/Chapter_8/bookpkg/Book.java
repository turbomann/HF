package GShildt.Chapter_8.bookpkg;

public class Book {
    protected String title;
    protected String author;
    protected int pubDate;


    public Book(String t, String a, int pd) {
        title = t;
        author = a;
        pubDate = pd;
    }

    public void toShow() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class ExtBook extends Book {
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show(){
        super.toShow();
        System.out.println(publisher);
        System.out.println();
   }

   public String getTitle(){return title;}
   public void setTitle(String t){title =t;}

   public String getAuthor(){return author;}
   public void setAuthor(String a){author = a;}

   public int getPubDate(){return pubDate;}
   public void setPubDate(int date){pubDate = date;}


}










