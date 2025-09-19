package org.example;

import java.time.ZonedDateTime;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/d")
public class RestDate {
  @GET
  @Produces("application/json")
  public String getDate() {
	  return """
           {"date" : "%s"}
            """.formatted(ZonedDateTime.now().toString());
  }
}
