import java.util.*;
import java.util.Scanner;
public class ExMethod {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();
        addBook(bookList);
        printBookList(bookList);
        delBook(bookList);
        printBookList(bookList);
    }
    public static void addBook(List<String> bookList) {

        {
            //Scanner scanner = new Scanner(System.in);
            //String scanner = ();
            boolean loop = true;
            while (loop) {
                System.out.println("Kitap eklemek için 'e' çıkmak için 'h' giriniz: ");
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.next();

                    if (Objects.equals(choice, "e")) {
                        System.out.println("Eklemek istediğiniz kitabı girin: ");
                        Scanner addBook = new Scanner(System.in);
                        String book = addBook.next();
                        bookList.add(book);
                    } else if (Objects.equals(choice, "h")) {
                        break;
                    } else {
                        System.out.println("Geçerli bir değer giriniz");
                    }
            }
        }
    }
    public static void addListBook() {

    }
    public static void printBookList(List<String> bookList) {
        System.out.println("Kitap Listem: " + bookList);

    }
    public static void delBook(List<String> bookList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silmek istediğiniz kitap ismini giriniz: ");
        String delBook = input.nextLine();
        for (int i=0;i<bookList.size();i++) {
            if (Objects.equals(delBook, bookList.get(i))) {
                bookList.remove(delBook);
            }
        }
    }
}
