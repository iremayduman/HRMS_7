package kodlama.io.javaCamp6.business.abstracts;

import java.util.List;

import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.entities.concretes.JobTitle;



public interface JobTitleService {

	    Result add(JobTitle jobtitle );
	    DataResult<List<JobTitle>> getAll();
	  
	 

}

	  
