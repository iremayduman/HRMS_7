package kodlama.io.javaCamp6.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlama.io.javaCamp6.core.abstracts.MernisCheckService;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;

@Component
@Primary
public class FakeMernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) {
		return true;
	}

}
