package entity;

import exception.BaseException;

public class Book {
     public String name;
     public String autor;
     public int prise;
     public int pages;
    {
        name = "No name";
        autor = "Anonim";
        prise = 0;
        pages = 1;
    }

    public Book(String runner, int i, int prise){

    };
    public Book(String name) throws BaseException {
        setName(name);
    }
    public Book(String name, String autor) throws BaseException {
        this(name);
        setAutor(autor);
    }
    public Book(String name, String autor, int prise) throws BaseException {
        this(name, autor);
        setPrise(prise);
    }
    public Book(String name, String autor, int prise, int pages) throws BaseException {
        this(name, autor, prise);
        setPages(pages);
    }
    public Book(String name,int pages) throws BaseException {
        this(name);
        setPages(pages);
    }
    public Book(int prise, int pages) throws BaseException {
        setPrise(prise);
        setPages(pages);
    }

    public void setName(String name) throws BaseException {
        if(name != null){
            this.name = name;
        }
        else throw new BaseException("No name") ;
    }
    public void setAutor(String autor) throws BaseException {
        if(autor != null ){
            this.autor = autor;
        }
        else throw new BaseException("No autor");
    }
    public void setPrise(int prise) throws BaseException {
        if(prise > 0 ){
            this.prise = prise;
        }
        else throw new BaseException("Negative year");
    }
    public void setPages(int pages) throws BaseException {
        if(pages > 0){
            this.pages = pages;
        }
        else throw new BaseException("Negative pages");
    }
    public String getName() throws BaseException {

        if ( name != null ){
            return name;
        }
        else throw new BaseException("No name");
    }

    public String getAutor() throws BaseException {
        if(autor != null) {
            return autor;
        }
        else throw new BaseException("No author");
    }
    public int getPages() throws BaseException {
        if(pages > 0) {
            return pages;
        }
        else throw new BaseException("Pages are negative");
    }
    public int getPrise() throws BaseException {
        if(prise > 0) {
            return prise;
        }
        else throw new BaseException("Prise is negative");
    }


    @Override
    public String toString(){
        return "entity.Book{"+
                "name = " + name + '\'' +
                ", autor = " + autor + '\'' +
                ", prise = "+ prise + '\'' +
                ", pages = " + pages +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (prise != book.prise) return false;
        if (pages != book.pages) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return autor != null ? autor.equals(book.autor) : book.autor == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + prise;
        result = 31 * result + pages;
        return result;
    }
}
