import com.google.common.collect.Lists;
import member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MemberRepository;

import java.util.List;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findMembers() {
        return Lists.newArrayList(memberRepository.findAll());
    }

    public void createMember(Member member) {
        if (!exists(member))
            memberRepository.save(member);
    }

    private boolean exists(Member m) {
        Iterable<Member> members = findMembers();
        for (Member member : members)
            if (member.equals(m)) return true;
        return false;
    }
}