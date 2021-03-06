package kodlama.io.javaCamp6.business.concretes;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import kodlama.io.javaCamp6.business.abstracts.JobTitleService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;

import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.JobTitleDao;

import kodlama.io.javaCamp6.entities.concretes.JobTitle;


	
@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;

     @Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>
		( this.jobTitleDao.findAll());
			}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Position added. ");
	}

}
	




	

	

