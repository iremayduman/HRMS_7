package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.entities.concretes.User;
public interface UserService {
	DataResult<List<User>> getAll();
}
