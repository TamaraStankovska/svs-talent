package repository;

import member.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member,Long> {
    Member findByName(String name);
    Member findById(Long id);

}

