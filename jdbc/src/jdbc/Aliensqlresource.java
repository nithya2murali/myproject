package jdbc;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/newaliens")
public class Aliensqlresource {

	AlienSql repo = new AlienSql();

	@GET
	@Path("/hialien")
	@Produces("application/json")
	public List<Alien> getAliens() {
		System.out.println("alien called");
		return repo.getAliens();
	}

	@GET
	@Path("/alien/{id}")
	@Produces("application/xml")
	public Alien getAlien(@PathParam("id") int id) {
		return repo.getAlien(id);
	}

	@POST
	@Path("/aliencreate")
	@Produces("application/xml")
	@Produces("application/json")
	public Alien createAlien(Alien a1) {
		System.out.println(a1);
		repo.create(a1);
		return a1;
	
}
