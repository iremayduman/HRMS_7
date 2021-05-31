package kodlama.io.javaCamp6.core.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.javaCamp6.MailSendService.MailSendManager;

import kodlama.io.javaCamp6.core.abstracts.EmailSendService;
@Service
public class MailManager implements EmailSendService {

	private MailSendManager mailSendManager;



	public MailManager(MailSendManager mailSendManager) {
		super();
		this.mailSendManager = mailSendManager;
	}



	@Override
	public void emailSend(String email) {
		mailSendManager.verificationSend(email);

	}
}
