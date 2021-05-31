package kodlama.io.javaCamp6.business.concretes;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlama.io.javaCamp6.business.abstracts.JobseekerService;

import kodlama.io.javaCamp6.core.abstracts.CheckMailService;
import kodlama.io.javaCamp6.core.abstracts.EmailSendService;
import kodlama.io.javaCamp6.core.abstracts.MernisCheckService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.ErrorResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;

import kodlama.io.javaCamp6.dataAccess.abstracts.JobseekerDao;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;
@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private CheckMailService mailCheckService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	
@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, CheckMailService mailCheckService,
			MernisCheckService mernisCheckService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.mailCheckService = mailCheckService;
		this.mernisCheckService = mernisCheckService;
	
	}

	
	@Override
	public Result login(String email, String password) {
		Result result = new ErrorResult("Giriş başarılı !!!");
		for (int i = 0; i < jobseekerDao.findAll().size(); i++) {
			if (jobseekerDao.findAll().get(i).getEmail() == email
					&& jobseekerDao.findAll().get(i).getPassword() == password) {
				result = new SuccessResult("Giriş başarısız!!!");
			}
		}
		return result;
	}

	@Override
	public Result register(Jobseeker jobseeker) {
		Result result = new ErrorResult("Giriş başarısız!!!");
		if (mailCheckService.mailCheck(jobseeker.getEmail())  && mernisCheckService.checkIfRealPerson(jobseeker)) {
			emailSendService.emailSend(jobseeker.getEmail());
			this.jobseekerDao.save(jobseeker);
			result = new SuccessResult("Login successful !");
		}
		return result;
	}




	@Override
	public DataResult<List<Jobseeker>> getAll() {
		
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}


	@Override
	public DataResult<List<Jobseeker>> getAllEmails(String email) {
		return new  SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findByEmail(email));
	}


	@Override
	public DataResult<List<Jobseeker>> getAllTcNo(String TcNo) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findByTcNo(TcNo));
	}
	
	
	}


