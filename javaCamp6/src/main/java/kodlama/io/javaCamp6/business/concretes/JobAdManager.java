package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.business.abstracts.JobAdService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.JobAdDao;
import kodlama.io.javaCamp6.entities.concretes.JobAd;

@Service
public class JobAdManager implements JobAdService{
private JobAdDao jobAdDao;
	

	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}
	@Override
	public DataResult<List<JobAd>> getAll() {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll());
	}

	@Override
	public Result add(JobAd jobAd) {
		this.jobAdDao.save(jobAd);
		return  new SuccessResult("Başarıyla eklendi");
	}
	@Override
	public DataResult<List<JobAd>> findByActiveTrue() {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findByActiveTrue());
	}
	@Override
	public DataResult<List<JobAd>> findByEmployer_IdAndActiveTrue(String companyName) {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findByActiveTrueAndEmployer_CompanyName(companyName));
	}
	@Override
	public DataResult<List<JobAd>> findByActiveTrueOrderByCreatedTimeDesc() {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findByActiveTrueOrderByCreatedTimeDesc());
	}
	@Override
	public DataResult<JobAd> findByIdAndActiveTrue(int id) {
		return new SuccessDataResult<JobAd>(this.jobAdDao.findByIdAndActiveTrue(id)) ;
	}


	

	   
}
