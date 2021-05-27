package kodlama.io.javaCamp6.core.abstracts;

import org.springframework.stereotype.Service;


import kodlama.io.javaCamp6.entities.concretes.Jobseeker;

@Service
public interface MernisCheckService {
	public boolean checkIfRealPerson(Jobseeker jobseeker);

}
