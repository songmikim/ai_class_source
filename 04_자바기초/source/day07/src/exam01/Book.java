package exam01;

import java.util.Objects;

public class Book {             // extends java.lang.Object 생략됨
    private int isbn;           // 도서번호
    private String title;       // 도서명
    private String author;      // 저자
    private  String publisher;  // 출판사

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", hashCode()='" + hashCode() + '\'' +
                '}';
    }

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    /*
    *  동등성 비교, 동등성은 가치 판단이 필요!
    *  @param obj
    *  @return
    * */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book book
                && isbn == book.isbn
                && title.equals(book.title)
                && author.equals(book.author)
                && publisher.equals(book.publisher)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publisher);
    }
}
