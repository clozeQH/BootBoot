package rahmah.springcars;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import carboot.Cars;

@RestController
public class helloController {
	
	@RequestMapping(value = "/hello" , produces = "application/json")
    public List<Cars> getcars() 
    {
		List<Cars> carList = new ArrayList<Cars>();
		carList.add(new Cars("R8","Audi"));
		return carList;
    }
}