package kodlama.io.javaCamp6.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailSendService {
	public void emailSend(String email);

}
