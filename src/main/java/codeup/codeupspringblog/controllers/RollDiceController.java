package codeup.codeupspringblog.controllers;

import codeup.codeupspringblog.Model.Dice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDiceController {

//    First Step we  get mapping for the roll-dice
    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }



    @GetMapping("/roll-dice/{diceNum}")
    public String roll(@PathVariable int diceNum, Model model ){
        model.addAttribute("chooseNum", diceNum);
        model.addAttribute("userNum", Dice.randomRollMethod() );
        return "roll-Dice";
    }


}
