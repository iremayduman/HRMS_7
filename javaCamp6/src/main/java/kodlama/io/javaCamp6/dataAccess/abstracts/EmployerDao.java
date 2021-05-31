package kodlama.io.javaCamp6.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.javaCamp6.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
	List<Employer> findByEmail(String email);
}
