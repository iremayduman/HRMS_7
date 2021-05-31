package kodlama.io.javaCamp6.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.javaCamp6.business.abstracts.JobseekerService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.core.utilities.results.Result;

import kodlama.io.javaCamp6.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekerController {
	private JobseekerService jobseekerService;

    @Autowired
    public JobseekerController(JobseekerService jobseekerService) {
        this.jobseekerService = jobseekerService;
    }

    @GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll(){
		return this.jobseekerService.getAll();
    }
  

    @PostMapping("/add")
	public Result add(@RequestBody Jobseeker jobseeker) {
		return this.jobseekerService.register(jobseeker);
    }
}
