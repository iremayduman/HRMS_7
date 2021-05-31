package kodlama.io.javaCamp6.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import kodlama.io.javaCamp6.business.abstracts.JobTitleService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/titles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;
	
   @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll() {
		
		return this.jobTitleService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	


}
