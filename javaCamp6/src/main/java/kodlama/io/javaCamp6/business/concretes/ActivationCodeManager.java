package kodlama.io.javaCamp6.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.business.abstracts.ActivationCodeService;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.core.utilities.results.SuccessResult;
import kodlama.io.javaCamp6.dataAccess.abstracts.ActivationCodeDao;
import kodlama.io.javaCamp6.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager implements ActivationCodeService{
	private ActivationCodeDao activationDao;

	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationDao) {
		super();
		this.activationDao = activationDao;
	}
	@Override
	public Result add(ActivationCode code) {
         this.activationDao.save(code);
		
		return new SuccessResult("Activation code save");
	}

}
