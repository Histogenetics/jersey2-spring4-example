
package com.underdog.jersey.spring.example.resource;

import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.underdog.jersey.spring.example.service.GreetingService;

/**
 * @author PaulSamsotha
 */
@Component
public class GreetingResourceImpl implements GreetingResource {

    @Autowired
    private GreetingService greetingService;

    @Override
    public Response getGreeting(String name) {
        String greeting = greetingService.getGreeting(name);
        return Response.ok(greeting).build();
    }

}
