package kodlama.io.javaCamp6.core.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlama.io.javaCamp6.core.abstracts.MernisCheckService;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisCheckAdapter implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(Jobseeker jobseeker) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(jobseeker.getTcNo()), 
						jobseeker.getFirstName(), 
						jobseeker.getLastName(), 
						jobseeker.getBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
