package com.example.security;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class OktaDemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("before run");
		SpringApplication.run(OktaDemoProjectApplication.class, args);
		System.out.println("after run");
		System.out.println("Kritika");
	}
	
	 @GetMapping("/")
    public String home(@AuthenticationPrincipal OidcUser user) {
        return "Welcome, "+ user.getFullName() + "!";
    }

}
