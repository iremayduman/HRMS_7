package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.business.abstracts.DepartmentService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.DepartmentDao;
import kodlama.io.javaCamp6.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>
		(this.departmentDao.findAll(), "Department listed.") ;
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Department added.");
	}

}
