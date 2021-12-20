import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static ArrayList<Shelf> shelf = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        do{
            System.out.println("1. Add book");
            System.out.println("2. Borrow book");
            System.out.println("3. Show trending shelf");
            System.out.println("4. Finish");

            System.out.println("Choose an option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("write book data");
                    sc.nextLine();
                    String [] data = sc.nextLine().split("&");

                    Book book = new Book(data[0], data[1], false);

                    int shelfNum = 0;
                    String shelfName = "";

                    if(shelf.isEmpty()){
                        shelfNum = 0;
                        System.out.println("Add shelf Name");
                        shelfName = sc.nextLine();
                    }else{
                        for(int i = 0; i < shelf.size(); i++){
                            System.out.println (i + "--->" + shelf.get(i).getshelfName());
                        }
                        System.out.println(shelf.size() + "---> Empty");
                        System.out.println("Select a shelf");
                        shelfNum = sc.nextInt();

                        if(shelfNum >= shelf.size()){
                            System.out.println("Add shelf name");
                            sc.nextLine();
                            shelfName = sc.nextLine();

                        }
                    }
                    addBook(shelfNum, shelfName, book);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(option != 4);
    }

    public static void addBook(int shelfNumber, String shelfName, Book book1) {
        
        if(shelfNumber< shelf.size()){
            shelf.get(shelfNumber).addBookInShelf(book1);
        }else{
            Shelf shelf1 = new Shelf(shelfName);
            shelf1.addBookInShelf(book1);
            shelf.add(shelf1);
        }

        System.out.println(shelf);
        for(int i=0; i<shelf.size(); i++){
            shelf.get(i).showBooks();
        }
    }

    public static void borrowBook(){

    }
    public static void showTrendingShelf(){

    }
}
