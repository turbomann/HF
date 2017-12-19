package turbomann.Chapter_3;

/**
 * Created by Roman on 19.12.2017.
 */
public class Books {
    String title;
    String author;
    }
class BooksTestDrive{
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        int x= 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        myBooks[0].title = "Java";
        myBooks[1].title = "C++";
        myBooks[2].title = "Oracle";

        myBooks[0].author = "Patric";
        myBooks[1].author = "Rob";
        myBooks[2].author = "Oleg";


        while (x<3){
            System.out.print(myBooks[x].title);
            System.out.print(", Author ");
            System.out.print(myBooks[x].author + ". ");
            x=x+1;
        }

    }
}
