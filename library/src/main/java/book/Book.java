package book;

import member.Member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String isbn;
    private String title;

    private Collection<Member> members;

    public Book(){
        members=new ArrayList<Member>();
    }

    public Book(String isbn,String title)
    {
        this.isbn=isbn;
        this.title=title;
        members=new ArrayList<Member>();
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString(){
        return isbn+" "+title;
    }

    public void addMember(Member member)
    {
        members.add(member);
    }
    public Collection<Member> getMembers(){
        return members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;

        Book b = (Book) o;

        if (!getIsbn().equals(b.getIsbn()))
            return false;
        return getTitle().equals(b.getTitle());


    }

    public Long getId() {
        return id;
    }
}
