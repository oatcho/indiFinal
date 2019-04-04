package indiFinal.controller;

import indiFinal.data.CharacterRepository;
import indiFinal.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    CharacterRepository characterRepository = new CharacterRepository();

    @RequestMapping("/")
    public String displayHomePage(ModelMap modelMap){
        characterRepository.addAllCharactersToArrayList();
        characterRepository.setAllCharacterPlanets();
        List<Character> allChars = characterRepository.getCharacters();
        modelMap.put("allChar", allChars);
        return "home";
    }

    @RequestMapping("/character/{name}")
    public String displayCharacterDetails(@PathVariable String name, ModelMap modelMap){
        Character character = characterRepository.findByName(name);
        modelMap.put("character", character);
        return "character-details";
    }
}
