package indiFinal.service;

import indiFinal.model.Character;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CharacterService {
    public Character fetchSingleCharacter(int characterID){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.USER_AGENT, "Spring");

        ResponseEntity<Character> response = restTemplate.exchange("https://swapi.co/api/people/" + characterID + "/?format=json",
                HttpMethod.GET, new HttpEntity<>(headers), Character.class);
        return response.getBody();
    }



}
