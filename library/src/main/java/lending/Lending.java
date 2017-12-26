package lending;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Lending {
    @Id
    @GeneratedValue
    private Long id;
    private Long memberId;
    private Long bookId;

    public Lending(){}

    public Lending(Long memberId, Long bookId) {
        this.memberId = memberId;
        this.bookId = bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public Long getBookId() {
        return bookId;
    }
}