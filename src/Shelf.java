import java.util.ArrayList;

public class Shelf {
    private String shelfName;
    private ArrayList<Book> books = new ArrayList();

    public Shelf(String shelfName1) {
        this.shelfName = shelfName1;
    }

    public void addBookInShelf(Book book1){
        books.add(book1);
    }
    public void showBooks(){
        for(int i=0; i<books.size(); i++){
            System.out.println(books.get(i));
        }
    }

    public String getshelfName() {
        return shelfName;
    }
    public void setshelfName(String shelfName) {
        this.shelfName = shelfName;
    }
    
    public String toString() {
        return "Shelf Name: " + "" + shelfName;
    }
}
