package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;

public interface JobseekerService {

	
	 Result login(String email, String password);
	
	 Result register(Jobseeker jobseeker);

	 DataResult<List<Jobseeker>> getAll();
	 DataResult<List<Jobseeker>> getAllEmails(String email);
	 DataResult<List<Jobseeker>> getAllTcNo(String TcNo);
	
}
