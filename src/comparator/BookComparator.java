package comparator;

import entity.Book;
import exception.BaseException;


import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        try {
            return o1.getName().compareTo(o2.getName());
        } catch (BaseException e) {
            e.getMessage();
        }
        return 0;
    }
}
