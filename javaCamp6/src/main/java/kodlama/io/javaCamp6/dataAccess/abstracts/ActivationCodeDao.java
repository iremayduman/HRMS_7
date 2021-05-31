package kodlama.io.javaCamp6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.javaCamp6.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository<ActivationCode, Integer>{

}
