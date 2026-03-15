import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddDuplicateBook() {
        Library library = new Library();

        Book book = new Book("Clean Code", "Robert Martin", "978-0132350884");
        library.addBook(book);
        library.addBook(book);

        System.out.println("Libros existentes: " + library.findAvailableBooks().size());
    }
}

@Test
    void testBusqueda() {
        Library lib = new Library();

        lib.addBook(new Book("Shalome", "Bendiciones", "911"));

        System.out.println("Resultado de la busqueda: " + lib.findBookByTitle("shalome"));
    }