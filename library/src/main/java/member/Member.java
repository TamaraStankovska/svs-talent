package member;

import book.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private Collection<Book> books;

    public Member()
    {
        books=new ArrayList<Book>();
    }
    public Member(String name)
    {
        this.name=name;
        books=new ArrayList<Book>();
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o)
            return true;
        if(!(o instanceof Member))
            return false;

        Member m=(Member) o;
        return getName()!=null ? getName().equals(m.getName()):m.getName()==null;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
    }

    public Long getId() {
        return id;
    }
}
