package com.example.webservices.database;

import java.util.HashMap;
import java.util.Map;

import com.example.webservices.model.Profile;

public class ProfileDb {
	
	private static Map<Long, Profile> profileMap = new HashMap<>();
	
	public static Map<Long, Profile> getProfile() {
		return profileMap;
	}
}
