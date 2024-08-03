package Book;

public class BookList {
    private Book[] books = new Book[10];

    private int usedSize = 0;//计数器

public BookList() {
    this.books[0] = new Book("三国演义", "罗贯中",10,"小说");
    this.books[1] = new Book("西游记", "吴承恩",11,"小说");
    this.books[2] = new Book("红楼梦", "曹雪芹",12,"小说");
    this.usedSize = 3;
}

    //-----返回一本书的下标-------
    public Book getBook(int id) {
        return books[id];
    }

    public void setBooks(int id,Book book) {
        books[id] = book;
    }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
