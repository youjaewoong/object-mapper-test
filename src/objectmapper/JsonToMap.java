package objectmapper;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		//String json = "{\"name\":\"intruder\", \"phone\":\"01054221111\"}";
		String json = "{\"name\":\"intruder\", \"phone\":\"01054221111\"}";
	
		Map<String, Object> pramsMap = new ObjectMapper().readValue(json, Map.class);
		System.out.println(pramsMap);
		
		Map<String, Object> map = new HashMap<>();
		System.out.println(map.isEmpty());
	}
	
}
