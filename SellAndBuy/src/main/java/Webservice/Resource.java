package Webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Client.ShipRepo;
import Client.shipping;

import java.util.List;


@Path("ships")
public class Resource {
	
	ShipRepo repo = new ShipRepo();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<shipping> getShippings() {
		
		System.out.print("shipping details");
		return repo.getShippings();
	}
	
	@GET
	@Path("ship/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public shipping getShipping(@PathParam("id")int id) {
		return repo.getShipping(id);
	}
	
	
	@POST
	@Path("ship")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public shipping createShipping(shipping s1) {
		System.out.print(s1);
		repo.create(s1);
		return s1;
	}
	
	@PUT
	@Path("ship")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public shipping updateShipping(shipping s1) {
		System.out.print(s1);
		if(repo.getShipping(s1.getId()).getId()==0)
		{
			repo.create(s1);
		}
		else {
			repo.update(s1);
		}
		repo.update(s1);
		return s1;
	}
	
	@DELETE
	@Path("ship/{id}")
	public shipping deleteShipping(@PathParam("id") int id) {
		shipping s = repo.getShipping(id);
		
		if(s.getId()!=0) 
			repo.delete(id);
		
		return s;
	}
}

