package helloworld;
//o123

import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import


@Path("/hi")
public class HelloWorldRest {
	@GET
	public String getMsg(){
		return "Hello World from Jersey";
	}
}
