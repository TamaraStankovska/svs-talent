import book.Book;
import lending.Lending;
import member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;
import repository.LendingRepository;
import repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LendingService {
    private BookRepository bookRepository;
    private MemberRepository memberRepository;
    private LendingRepository lendingRepository;

    @Autowired
    public LendingService(BookRepository bookRepository, MemberRepository memberRepository, LendingRepository lendingRepository) {
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
        this.lendingRepository = lendingRepository;
    }

    public List<Member> getMembersLendedAt(Long bookId) {
        List<Member> members = new ArrayList<Member>();
        Iterable<Lending> lendings = lendingRepository.findAllByBookId(bookId);
        for (Lending lending : lendings) {
            Member member = memberRepository.findById(lending.getMemberId());
            members.add(member);
        }
        return members;
    }

    public List<Book> getBooksLendedBy(Long memberId) {
        List<Book> books = new ArrayList<Book>();
        Iterable<Lending> lendings = lendingRepository.findAllByMemberId(memberId);
        for (Lending lending : lendings) {
            Book book = bookRepository.findById(lending.getBookId());
            books.add(book);
        }
        return books;
    }

    public void lendBook(Long memberId, Long bookId) {
        Lending lending = new Lending(memberId, bookId);
        lendingRepository.save(lending);
    }

    public List<Integer> getMemberCounts() {
        List<Integer> counts = new ArrayList<Integer>();
        Iterable<Book> books = bookRepository.findAll();
        for (Book book : books) {
            counts.add(this.getMembersLendedAt(book.getId()).size());
        }
        return counts;
    }

    public List<Integer> getBookCounts() {
        List<Integer> counts = new ArrayList<Integer>();
        Iterable<Member> members = memberRepository.findAll();
        for (Member member : members) {
            counts.add(this.getBooksLendedBy(member.getId()).size());
        }
        return counts;
    }
}