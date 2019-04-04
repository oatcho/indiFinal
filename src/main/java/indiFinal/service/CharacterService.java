package indiFinal.service;

import indiFinal.model.Character;
import indiFinal.model.Planet;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

public class CharacterService {
    public Character fetchSingleCharacter(int characterID){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "");
        ResponseEntity<Character> response = restTemplate.exchange("https://swapi.co/api/people/" + characterID + "/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), Character.class);
        return response.getBody();
    }

    public Planet fetchSinglePlanet(int planetID){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "");
        ResponseEntity<Planet> response = restTemplate.exchange("https://swapi.co/api/planets/" + planetID + "/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), Planet.class);
        return response.getBody();
    }





}
