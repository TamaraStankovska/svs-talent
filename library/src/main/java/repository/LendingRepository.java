package repository;

import lending.Lending;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface LendingRepository extends CrudRepository<Lending,Long> {
    Iterable<Lending> findAllByMemberId(Long memberId);

    Iterable<Lending> findAllByBookId(Long bookId);
}
