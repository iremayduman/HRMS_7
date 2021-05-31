package kodlama.io.javaCamp6.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlama.io.javaCamp6.core.abstracts.CheckMailService;



@Component
@Primary
public class FakeMailCheckManager implements CheckMailService{
	

	@Override
	public boolean mailCheck(String email) {
		return true;
	}

}
