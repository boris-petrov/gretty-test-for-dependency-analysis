package com.company;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("test-resource")
public class TestResource {
	@GET
	@Produces("text/plain")
	public String hello() {
		return "Hello World!";
	}
}
