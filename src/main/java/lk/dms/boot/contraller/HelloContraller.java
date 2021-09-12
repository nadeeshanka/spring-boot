package lk.dms.boot.contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContraller {
	
	@GetMapping("/")
	public String getvalue() {
		return "Hellow worldss!";
	}

}
