package com.example.webservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.webservices.database.ProfileDb;
import com.example.webservices.model.Profile;

public class ProfileService {
	
	public ProfileService() {
//		Profile profile1 = new Profile(1, "John", 30, "Test Data");
//		Profile profile2 = new Profile(1, "Marry", 28, "My first Profile");
//		
//		profiles.put(1L, profile1);
//		profiles.put(2L, profile2);
	}
	
	private Map<Long, Profile> profiles = ProfileDb.getProfile();
	
	public List<Profile> getProfiles() {		
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(long id) {
		return profiles.get(id);
	}
	
	public Profile addProfile(Profile profile) {
		long id = profiles.size() + 1;
		profile.setId(id);
		profiles.put(id, profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getId() <= 0) {
			return null;
		}
		profiles.put(profile.getId(), profile);
		return profile;
		
	}
	
	public String deleteProfile(long id) {
		if(!profiles.containsKey(id)) {
			return "Profile doesn't exist";
		}
		profiles.remove(id);
		return "Successfully Deleted!";
	}

}
