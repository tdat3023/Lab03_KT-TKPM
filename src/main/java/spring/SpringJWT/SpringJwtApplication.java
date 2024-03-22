package spring.SpringJWT;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import spring.SpringJWT.model.Role;
import spring.SpringJWT.model.User;
import spring.SpringJWT.service.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner runner(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null,"ROLE_USER"));
//			userService.saveRole(new Role(null,"ROLE_ADMIN"));
//			userService.saveRole(new Role(null,"ROLE_MANAGER"));
//			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null,"Victor Hugo","victor123","123456",new ArrayList<>()));
//			userService.saveUser(new User(null,"Rabindranath Tagore","rabin123","123456",new ArrayList<>()));
//			userService.saveUser(new User(null,"Balzac ","balzac123","123456",new ArrayList<>()));
//			userService.saveUser(new User(null,"Alexandre","andre123","123456",new ArrayList<>()));
//
//			userService.addRoleToUser("victor123","ROLE_USER");
//			userService.addRoleToUser("rabin123","ROLE_MANAGER");
//			userService.addRoleToUser("andre123","ROLE_ADMIN");
//			userService.addRoleToUser("balzac123","ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("balzac123","ROLE_MANAGER");
//			userService.addRoleToUser("balzac123","ROLE_SUPER_ADMIN");
//		};
//	}
}
