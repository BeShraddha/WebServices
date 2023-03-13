package com.example.webservices.resource;

import java.util.List;

import com.example.webservices.model.Profile;
import com.example.webservices.service.ProfileService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profiles")
public class Resource {
	
	ProfileService ps = new ProfileService();

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfiles() {
		return ps.getProfiles();
	}
	
	@GET
	@Path("{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileId") long id) {
		return ps.getProfile(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile addProfile(Profile profile) {
		return ps.addProfile(profile);
	}
	
	@PUT
	@Path("{profileID}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Profile updateProfile(@PathParam("profileID") long id, Profile profile) {
		profile.setId(id);
		return ps.updateProfile(profile);
	}
	
	@DELETE
	@Path("{profileId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteProfile(@PathParam("profileId") long id) {
		return ps.deleteProfile(id);
	}
}
