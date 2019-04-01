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

    public void setAllCharactersAndAddToArrayList(){

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

        Character luke = characterService.fetchSingleCharacter(1);
        Character luke1 = new Character(luke.getName(), luke.getBirthYear(), luke.getGender(), tatoo.getName());
        characters.add(luke1);

        Character c3 = characterService.fetchSingleCharacter(2);
        Character c31 = new Character(c3.getName(), c3.getBirthYear(), c3.getGender(), tatoo.getName());
        characters.add(c31);

        Character r2 = characterService.fetchSingleCharacter(3);
        Character r21 = new Character(r2.getName(), r2.getBirthYear(), r2.getGender(), naboo.getName());
        characters.add(r21);

        Character darth = characterService.fetchSingleCharacter(4);
        Character darth1 = new Character(darth.getName(), darth.getBirthYear(), darth.getGender(), tatoo.getName());
        characters.add(darth1);

        Character leia = characterService.fetchSingleCharacter(5);
        Character leia1 = new Character(leia.getName(), leia.getBirthYear(), leia.getGender(), aldereen.getName());
        characters.add(leia1);

        Character obi = characterService.fetchSingleCharacter(10);
        Character obi1 = new Character(obi.getName(), obi.getBirthYear(), obi.getGender(), stew.getName());
        characters.add(obi1);

        Character chew = characterService.fetchSingleCharacter(13);
        Character chew1 = new Character(chew.getName(), chew.getBirthYear(), chew.getGender(), kash.getName());
        characters.add(chew1);

        Character han = characterService.fetchSingleCharacter(14);
        Character han1 = new Character(han.getName(), han.getBirthYear(), han.getGender(), corel.getName());
        characters.add(han1);

        Character wed = characterService.fetchSingleCharacter(18);
        Character wed1 = new Character(wed.getName(), wed.getBirthYear(), wed.getGender(), corel.getName());
        characters.add(wed1);

        Character yoda = characterService.fetchSingleCharacter(20);
        Character yoda1 = new Character(yoda.getName(), yoda.getBirthYear(), yoda.getGender(), unknown.getName());
        characters.add(yoda1);

        Character palp = characterService.fetchSingleCharacter(21);
        Character palp1 = new Character(palp.getName(), palp.getBirthYear(), palp.getGender(), naboo.getName());
        characters.add(palp1);

        Character boba = characterService.fetchSingleCharacter(22);
        Character boba1 = new Character(boba.getName(), palp.getBirthYear(), palp.getGender(), kam.getName());
        characters.add(boba1);

        Character ig = characterService.fetchSingleCharacter(23);
        Character ig1 = new Character(ig.getName(), ig.getBirthYear(), ig.getGender(), unknown.getName());
        characters.add(ig1);

        Character bosk = characterService.fetchSingleCharacter(24);
        Character bosk1 = new Character(bosk.getName(), bosk.getBirthYear(), bosk.getGender(), tran.getName());
        characters.add(bosk1);

        Character lan = characterService.fetchSingleCharacter(25);
        Character lan1 = new Character(lan.getName(), lan.getBirthYear(), lan.getGender(), soc.getName());
        characters.add(lan1);

        Character lob = characterService.fetchSingleCharacter(26);
        Character lob1 = new Character(lob.getName(), lob.getBirthYear(), lob.getGender(), bespin.getName());
        characters.add(lob1);

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
