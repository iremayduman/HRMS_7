package kodlama.io.javaCamp6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.business.abstracts.UserService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.SuccessDataResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.UserDao;
import kodlama.io.javaCamp6.entities.concretes.User;

@Service
public class UserManager implements UserService {
 
	private UserDao userdao;
	
	@Autowired
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userdao.findAll());
		
	}
}
