package kodlama.io.javaCamp6.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.javaCamp6.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {
List<JobAd> findByActiveTrue();
	
	List<JobAd> findByActiveTrueAndEmployer_CompanyName(String companyName);
	
	List<JobAd> findByActiveTrueOrderByCreatedTimeDesc();
	
	JobAd findByIdAndActiveTrue(int id);
}
