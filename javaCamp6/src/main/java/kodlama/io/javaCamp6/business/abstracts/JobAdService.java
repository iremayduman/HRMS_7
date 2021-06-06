package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.entities.concretes.JobAd;

public interface JobAdService {
    DataResult<List<JobAd>> getAll();
	
	Result add( JobAd jobAd);
	
    DataResult<List<JobAd>> findByActiveTrue();
	
    DataResult<List<JobAd>>findByEmployer_IdAndActiveTrue( String companyName);
	
   DataResult<List<JobAd>>findByActiveTrueOrderByCreatedTimeDesc();
	
	DataResult<JobAd> findByIdAndActiveTrue(int id);

}
