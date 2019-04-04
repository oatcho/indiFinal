package indiFinal.data;

import indiFinal.model.Character;
import indiFinal.model.Planet;
import indiFinal.service.CharacterService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CharacterRepository {
    private ArrayList<Character> characters = new ArrayList<>();
    CharacterService characterService = new CharacterService();

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public void addAllCharactersToArrayList(){
        Character luke = characterService.fetchSingleCharacter(1);
        characters.add(luke);

        Character c3 = characterService.fetchSingleCharacter(2);
        characters.add(c3);

        Character r2 = characterService.fetchSingleCharacter(3);
        characters.add(r2);

        Character darth = characterService.fetchSingleCharacter(4);
        characters.add(darth);

        Character leia = characterService.fetchSingleCharacter(5);
        characters.add(leia);

        Character obi = characterService.fetchSingleCharacter(10);
        characters.add(obi);

        Character chew = characterService.fetchSingleCharacter(13);
        characters.add(chew);

        Character han = characterService.fetchSingleCharacter(14);
        characters.add(han);

        Character wed = characterService.fetchSingleCharacter(18);
        characters.add(wed);

        Character yoda = characterService.fetchSingleCharacter(20);
        characters.add(yoda);

        Character palp = characterService.fetchSingleCharacter(21);
        characters.add(palp);

        Character boba = characterService.fetchSingleCharacter(22);
        characters.add(boba);

        Character ig = characterService.fetchSingleCharacter(23);
        characters.add(ig);

        Character bosk = characterService.fetchSingleCharacter(24);
        characters.add(bosk);

        Character lan = characterService.fetchSingleCharacter(25);
        characters.add(lan);

        Character lob = characterService.fetchSingleCharacter(26);
        characters.add(lob);
    }

    public void setAllCharacterPlanets(){
        Planet tatoo = characterService.fetchSinglePlanet(1);
        Planet naboo = characterService.fetchSinglePlanet(8);
        Planet aldereen = characterService.fetchSinglePlanet(2);
        Planet stew = characterService.fetchSinglePlanet(20);
        Planet kash = characterService.fetchSinglePlanet(14);
        Planet corel = characterService.fetchSinglePlanet(22);
        Planet unknown = characterService.fetchSinglePlanet(28);
        Planet kam = characterService.fetchSinglePlanet(10);
        Planet tran = characterService.fetchSinglePlanet(29);
        Planet soc = characterService.fetchSinglePlanet(30);
        Planet bespin = characterService.fetchSinglePlanet(6);

        characters.get(0).setHomeworld(tatoo.getName());
        characters.get(1).setHomeworld(tatoo.getName());
        characters.get(2).setHomeworld(naboo.getName());
        characters.get(3).setHomeworld(tatoo.getName());
        characters.get(4).setHomeworld(aldereen.getName());
        characters.get(5).setHomeworld(stew.getName());
        characters.get(6).setHomeworld(kash.getName());
        characters.get(7).setHomeworld(corel.getName());
        characters.get(8).setHomeworld(corel.getName());
        characters.get(9).setHomeworld(unknown.getName());
        characters.get(10).setHomeworld(naboo.getName());
        characters.get(11).setHomeworld(kam.getName());
        characters.get(12).setHomeworld(unknown.getName());
        characters.get(13).setHomeworld(tran.getName());
        characters.get(14).setHomeworld(soc.getName());
        characters.get(15).setHomeworld(bespin.getName());
    }

    public Character findByName(String name){
        for (Character character: characters){
            if (character.getName().equalsIgnoreCase(name)){
                return character;
            }
        }
        return null;
    }
}
