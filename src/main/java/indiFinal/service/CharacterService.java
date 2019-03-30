package indiFinal.service;

import indiFinal.model.Character;
import org.springframework.web.client.RestTemplate;

public class CharacterService {
    public Character fetchSingleCharacter(int characterID){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://swapi.co/api/people/" + characterID, Character.class);
    }
}
