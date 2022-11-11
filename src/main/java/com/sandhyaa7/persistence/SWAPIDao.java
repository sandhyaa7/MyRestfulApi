package com.sandhyaa7.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Planet;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class SWAPIDao {

    Planet getPlanet(){
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://swapi.dev/api/planets/1");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Planet planet = null;
        try {
            planet = mapper.readValue(response, Planet.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return planet;
    }
}
