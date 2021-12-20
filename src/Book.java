public class Book {
    private String isbn;
    private String title;
    private boolean borrowed;


    //Constructor de la clase Libro así cada vez que creemos un objeto se crea con los parámetros
    public Book(String ISBN, String title, boolean borrowed){
        this.isbn = ISBN;
        this.title = title;
        this.borrowed = borrowed;
    }
    
    //Getter y setter
    public String getIsbn() {
        return isbn;
    }
    public boolean isborrowed() {
        return borrowed;
    }
    public void setborrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        String status = "Disponible";
        if (this.borrowed = true){
            status = "No disponible";
        }
        return "ISBN:" + this.isbn + "Title:" + this.title + "Estatus:" + status;
    }
}
