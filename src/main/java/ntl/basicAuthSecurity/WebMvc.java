package ntl.basicAuthSecurity;
  
import org.springframework.context.annotation.Configuration; 
import org.springframework.web.servlet.config.annotation.CorsRegistry; 
import org.springframework.web.servlet.config.annotation.EnableWebMvc; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
  
@Configuration
@EnableWebMvc 
public class WebMvc implements WebMvcConfigurer {
  
	@Override 
	public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/**")
			.allowedOrigins("http://localhost:4200")
			.allowedHeaders("*")
			.allowedMethods("OPTIONS", "HEAD", "PUT", "POST", "GET", "DELETE", "PATCH")
			.allowCredentials(true); 
	} 
}
 