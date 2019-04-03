package ntl.todo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//we need to tell spring to allow a requests from a specific URL
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	// "---" or path="---" are the same
	@GetMapping(value="/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	//RequestMapping is the general, it send with get by default
	@GetMapping(value="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello From the Other Side");
		/*throw new RuntimeException("The server is shutting down :(");
		 * just to test the other case if the user didn't get the data ! 
		 */
	}
	@GetMapping(value="/hello/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean("Hello "+name+ " !");
	}
}
