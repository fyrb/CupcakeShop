package helloworld;
//online123

import javax.ws.rs.GET;
import javax.ws.rs.Path;



@Path("/hi")
public class HelloWorldRest {
	@GET
	public String getMsg(){
		return "Hello World from Jersey";
	}

}
//666
