package kodlama.io.javaCamp6.business.concretes;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlama.io.javaCamp6.business.abstracts.JobseekerService;
import kodlama.io.javaCamp6.core.abstracts.CheckEmailService;
import kodlama.io.javaCamp6.core.abstracts.EmailSendService;
import kodlama.io.javaCamp6.core.abstracts.MernisCheckService;

import kodlama.io.javaCamp6.core.utilities.results.ErrorResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;

import kodlama.io.javaCamp6.dataAccess.abstracts.JobseekerDao;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;
@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private CheckEmailService emailCheckService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();
@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, CheckEmailService emailCheckService,
			MernisCheckService mernisCheckService, EmailSendService emailSendService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.emailCheckService = emailCheckService;
		this.mernisCheckService = mernisCheckService;
		this.emailSendService = emailSendService;
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
		if (emailCheckService.mailCheck(jobseeker.getEmail()) && emailIsItUsed(jobseeker.getEmail())
				&& tcNoIsItUsed(jobseeker.getTcNo()) && mernisCheckService.checkIfRealPerson(jobseeker)) {
			emailSendService.emailSend(jobseeker.getEmail());
			this.jobseekerDao.save(jobseeker);
			result = new SuccessResult("Login successful !");
		}
		return result;
	}

	public boolean emailIsItUsed(String email) {
		boolean result = true;
		if (getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

	public boolean tcNoIsItUsed(String TcNo) {
		boolean result = true;
		if (getAllTcNo().contains(TcNo)) {
			result = false;
		}
		return result;

	}

	@Override
	public List<String> getAllEmails() {
		for (int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}

	@Override
	public List<String> getAllTcNo() {
		for (int i = 0; i < getAll().size(); i++) {
			identificationNumbers.add(getAll().get(i).getTcNo());
		}
		return identificationNumbers;
	}

	@Override
	public List<Jobseeker> getAll() {
		return this.jobseekerDao.findAll();
	}
	
	
	}


