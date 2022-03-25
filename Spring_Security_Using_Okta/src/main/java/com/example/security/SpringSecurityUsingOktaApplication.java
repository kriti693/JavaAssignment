package com.example.security;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityUsingOktaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityUsingOktaApplication.class, args);
		System.out.println("Welcome");
	}

	@GetMapping("/")
    public void Home(HttpServletResponse httpServletResponse)  {
		try {
			httpServletResponse.sendRedirect("https://www.primevideo.com/");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
