package si.RSOteam8;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedList;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("demo/info")
public class DemoResource {

    @GET
    public Response getAllUsers() {

        return Response.ok(new Demo()).build();
    }
}
