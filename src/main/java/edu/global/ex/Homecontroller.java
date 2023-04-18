package edu.global.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Homecontroller {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/user/userHome")
	public void userHome() {
		log.info("userHome ...");
	}

	@GetMapping("/admin/adminHome")
	public void adminHome() {
		log.info("adminHome ...");
	}

}
