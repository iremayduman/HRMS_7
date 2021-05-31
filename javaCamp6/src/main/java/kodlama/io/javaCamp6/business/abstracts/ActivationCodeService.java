package kodlama.io.javaCamp6.business.abstracts;

import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.entities.concretes.ActivationCode;

public interface ActivationCodeService {
	Result add(ActivationCode code);
}
