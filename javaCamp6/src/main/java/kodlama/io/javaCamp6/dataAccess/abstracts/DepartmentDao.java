package kodlama.io.javaCamp6.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.javaCamp6.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
