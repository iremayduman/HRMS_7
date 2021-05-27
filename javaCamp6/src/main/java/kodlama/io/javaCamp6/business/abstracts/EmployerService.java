package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.entities.concretes.Employer;

public interface EmployerService {

	public Result login(String email, String password);

	public Result register(Employer employer);

	DataResult<List<Employer>> getAll();
	public List<String> getAllEmails();
}
