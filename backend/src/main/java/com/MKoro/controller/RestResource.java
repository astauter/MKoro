package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MKoro.entity.User;
import com.MKoro.entity.repository.UserRepository;

@RestController
public class RestResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping
	public void signUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
