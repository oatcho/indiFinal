package indiFinal.controller;

import indiFinal.model.Character;
import indiFinal.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    CharacterService characterService = new CharacterService();



    @RequestMapping("/")
    public String displayHomePage(ModelMap modelMap){

        Character luke = characterService.fetchSingleCharacter(1);

        modelMap.put("name", luke.getName());
        return "home";
    }
}
