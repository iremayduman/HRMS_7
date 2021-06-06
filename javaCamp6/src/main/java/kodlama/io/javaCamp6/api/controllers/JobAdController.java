package kodlama.io.javaCamp6.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.javaCamp6.business.abstracts.JobAdService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;
import kodlama.io.javaCamp6.entities.concretes.JobAd;

@RestController
@RequestMapping("/api/jobAd")
public class JobAdController {
	private JobAdService jobAdService;

	@Autowired
	public JobAdController( JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobAd>> getAll(){
		return this.jobAdService.getAll();
	}
	@GetMapping("/add")
	public Result add(@RequestBody JobAd jobAd) {
		return this.jobAdService.add(jobAd);
		
	}
	@GetMapping("/findByActiveTrue")
	public DataResult<List<JobAd>> findByActiveTrue(){
		return this.jobAdService.findByActiveTrue();
		
	}
	@GetMapping("/findByEmployer_IdAndActiveTrue")
	public DataResult<List<JobAd>>findByEmployer_IdAndActiveTrue(@RequestParam int employerId){
		return this.findByEmployer_IdAndActiveTrue( employerId);
	}
	@GetMapping("/findByActiveTrueOrderByCreatedTimeDesc")
	public DataResult<List<JobAd>>findByTrueActiveOrderByCreatedTimeDesc(){
		return this.jobAdService.findByActiveTrueOrderByCreatedTimeDesc();
	}
	@GetMapping("/findByIdAndActiveTrue")
	public DataResult<JobAd> findByIdAndActiveTrue(int id){
		return this.findByIdAndActiveTrue(id);
		
	}
    
    
    
}
