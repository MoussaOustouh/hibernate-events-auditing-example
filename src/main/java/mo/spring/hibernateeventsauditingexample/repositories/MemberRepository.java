package mo.spring.hibernateeventsauditingexample.repositories;

import mo.spring.hibernateeventsauditingexample.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
