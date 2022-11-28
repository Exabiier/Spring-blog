package codeup.codeupspringblog.controllers;

import codeup.codeupspringblog.models.Coffee;
import codeup.codeupspringblog.repositories.CoffeeRepository;

import codeup.codeupspringblog.repositories.supplierRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeRepository coffeeDao;
    private final supplierRepository suppliersDao;

    public CoffeeController(CoffeeRepository coffeeDao, supplierRepository suppliersDao){
        this.coffeeDao = coffeeDao;
        this.suppliersDao = suppliersDao;
    }

    public CoffeeController( supplierRepository suppliersDao){

        this.suppliersDao = suppliersDao;
    }

    @GetMapping
    public String coffee(){
        return "coffee";
    }

    @GetMapping("/{roast}")
    public String roast(@PathVariable String roast, Model model){
        Coffee selection = new Coffee(roast, "Cool Beans");
        Coffee selection2 = new Coffee(roast, "Coffee Bros");
        selection.setOrigin("Ethiopia");
        selection2.setOrigin("Vietnam");
        List<Coffee> selections = new ArrayList<>(List.of(selection, selection2));
        model.addAttribute("selections", selections);
        return "coffee";
    }

    @GetMapping("/all-coffees")
    public String allCoffees(Model model){
        List<Coffee> coffees = coffeeDao.findAll();
        model.addAttribute("coffees", coffees);
        return "all-coffees";
    }

    @GetMapping("/new")
    public String addCoffeeForm(){
        return "create-coffee";
    }


    @PostMapping("/new")
    public String addCoffee(@RequestParam(name="roast") String roast, @RequestParam(name="origin") String origin, @RequestParam(name="brand") String brand){
        Coffee coffee = new Coffee(roast, origin, brand);
        coffeeDao.save(coffee);
        return "redirect:/coffee/all-coffees";
    }

    @PostMapping
    public String signUp(@RequestParam(name="email") String email, Model model){
        model.addAttribute("email", email);
        return "coffee";
    }

    @GetMapping("/suppliers")
    public String showSupplierForm() {
        return "/suppliers";
    }
}
