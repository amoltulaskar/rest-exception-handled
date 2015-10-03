package com.training.component.api.v1;

import com.training.component.exception.badmethodexception;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1/helloworld")
public class helloworld{
  @GET
  public String getHelloWorldMessage(){
	if(true){
		throw new badmethodexception();
	}
	return "hi";
  }
}
