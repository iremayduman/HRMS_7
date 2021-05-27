package kodlama.io.javaCamp6.core.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.core.abstracts.EmailSendService;
import kodlama.io.javaCamp6.mailService.MailSendManager;

@Service
public class EmailSendManagerAdapter implements EmailSendService {

	private MailSendManager mailSendManager;


	public EmailSendManagerAdapter(MailSendManager mailSendManager) {
		super();
		this.mailSendManager = mailSendManager;
	}


	@Override
	public void emailSend(String email) {
		mailSendManager.verificationSend(email);

	}

}
