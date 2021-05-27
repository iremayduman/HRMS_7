package kodlama.io.javaCamp6.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.javaCamp6.entities.concretes.JobTitle;
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
	
    List<JobTitle> findByTitle(String title);

}
