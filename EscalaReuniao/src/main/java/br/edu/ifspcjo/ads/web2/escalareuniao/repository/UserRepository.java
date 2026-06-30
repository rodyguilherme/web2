package br.edu.ifspcjo.ads.web2.escalareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifspcjo.ads.web2.escalareuniao.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
