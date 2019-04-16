package bookDao;

import bookInterface.BookListInterface;
import entity.Book;

import java.util.*;

public class BookListDao implements BookListInterface {

    List<String> books = new ArrayList<>();

    public List<String> getBooks() {
        return books;
    }


    @Override
    public void add(Book book) {

        if(book != null){
            books.add(bookNames(book));
        }
    }

    @Override
    public String bookNames(Book book){
        String str = "";
        if(book != null) {
                str = book.name + " " + book.autor + " "+ book.pages +" "+ book.prise;
        }
        return str;
    }

    @Override
    public void remove(int indx){
        books.remove(indx);
    }

    @Override
    public int FindByTag(String name){
       return books.indexOf(name);

    }
    @Override
    public String sotrByCollections(){
       Collections.sort(books);
       return books.toString();
    }

}
