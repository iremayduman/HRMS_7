package kodlama.io.javaCamp6.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.javaCamp6.business.abstracts.UserService;
import kodlama.io.javaCamp6.core.utilities.results.DataResult;
import kodlama.io.javaCamp6.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService service;

	@Autowired
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.service.getAll();
	}
}
