package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;


import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;

public interface JobseekerService {

	
	public Result login(String email, String password);

	public Result register(Jobseeker jobseeker);

	public List<Jobseeker> getAll();
	public List<String> getAllEmails();
	public List<String> getAllTcNo();
	
}
