package com.training.component.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: tulaska
 * Date: 2/10/15
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Provider
public class exceptionhandler implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable e) {
        Response response = null;
        if(e instanceof badmethodexception){
            badmethodexception be = (badmethodexception)e;
            Object entity = new errormessage().setErrorCode(101L)
                    .setErrorMessage("Bad method")
                    .setDocLink("github/readme")
                    .setErrorId(UUID.randomUUID().toString());
            response = Response.status(400).entity(entity).type(MediaType.APPLICATION_JSON_TYPE)
                    .build();
        }
        return response;
    }
}
