package testing;

import bookDao.BookListDao;
import comparator.BookComparator;
import entity.Book;
import exception.BaseException;

public class Runner {
    public static void main(String[] args) throws BaseException {
        Book book = new Book("Inferno", "Den Brown", 12 , 300);
        Book book1 = new Book("1984","George Oryel", 15, 340);
        BookListDao bookListDao = new BookListDao();
        bookListDao.add(book);
        bookListDao.add(book1);
        System.out.println(bookListDao.bookNames(book) + "\n" + bookListDao.bookNames(book1));

        String str = bookListDao.bookNames(book);
        int index = bookListDao.FindByTag(str);

        String str1 = bookListDao.bookNames(book1);
        int index1 = bookListDao.FindByTag(str1);

        System.out.println("Index by name : " + index + "  " + index1);

        String sort = bookListDao.sotrByCollections();
        System.out.println(sort);

        BookComparator bookComparator = new BookComparator();
        System.out.println(bookComparator.compare(book1, book));

        bookListDao.remove(index);
        System.out.println(bookListDao.getBooks());
    }
}
