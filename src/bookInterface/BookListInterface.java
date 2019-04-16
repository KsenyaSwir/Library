package bookInterface;

import entity.Book;

public interface BookListInterface {
    void add(Book book);
    String bookNames(Book book);
    void remove(int indx);
    int FindByTag(String name);
    String sotrByCollections();


}
