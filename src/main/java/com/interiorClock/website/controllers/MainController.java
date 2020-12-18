package com.interiorClock.website.controllers;

import com.interiorClock.website.entities.ClockEntity;
import com.interiorClock.website.repo.ClockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    ClockRepository clockRepository;

    @GetMapping("/")
    public String Home(Model model) {
        model.addAttribute("pageTitle", "Home");

        Iterable<ClockEntity> wallClocks = clockRepository.findAllByCategory("Wall", Sort.by(Sort.Direction.ASC, "clockId"));
        Iterable<ClockEntity> deskClocks = clockRepository.findAllByCategory("Desk", Sort.by(Sort.Direction.ASC, "clockId"));
        Iterable<ClockEntity> alarmClocks = clockRepository.findAllByCategory("Alarm", Sort.by(Sort.Direction.ASC, "clockId"));

        model.addAttribute("wallClocks", wallClocks);
        model.addAttribute("deskClocks", deskClocks);
        model.addAttribute("alarmClocks", alarmClocks);

        Iterable<ClockEntity> clocks = clockRepository.findAll(Sort.by(Sort.Direction.DESC, "clockId"));
        ArrayList<ClockEntity> arr = new ArrayList<>();
        Integer i = 7;

        for(ClockEntity clock : clocks) {
            if(i > 0) {
                arr.add(clock);
                i--;
            }
        }
        model.addAttribute("newClocks", arr);

        return "index";
    }

    @GetMapping("/shop")
    public String Shop(Model model) {
        model.addAttribute("pageTitle", "Shop");

        Iterable<ClockEntity> clocks = clockRepository.findAll(Sort.by(Sort.Direction.ASC, "clockId"));
        Long countClocks = clockRepository.count();

        model.addAttribute("clocks", clocks);
        model.addAttribute("countClocks", countClocks);

        return "shop";
    }

    @GetMapping("/shop/product/{id}")
    public String Product(@PathVariable(value = "id") Integer id, Model model) {
        model.addAttribute("pageTitle", "Product");

        Optional<ClockEntity> clock = clockRepository.findById(id);
        ArrayList<ClockEntity> arr = new ArrayList<>();
        clock.ifPresent(arr::add);
        model.addAttribute("clock", arr);

        String category = clock.get().getCategory();
        Iterable<ClockEntity> relatedClocks = clockRepository.findAllByCategory(category, Sort.by(Sort.Direction.ASC, "clockId"));
        model.addAttribute("relatedClocks", relatedClocks);

        return "product-details";
    }

    @GetMapping("/contact")
    public String Contact(Model model) {
        model.addAttribute("pageTitle", "Contact us");
        return "contact-us";
    }

    @GetMapping("/authorization")
    public String Authorization(Model model) {
        model.addAttribute("pageTitle", "Authorization");
        return "login-register";
    }

    @GetMapping("/account")
    public String Account(Model model) {
        model.addAttribute("pageTitle", "Account");

        Iterable<ClockEntity> clocks = clockRepository.findAll(Sort.by(Sort.Direction.DESC, "clockId"));
        model.addAttribute("clocks", clocks);

        return "my-account";
    }

    @PostMapping("/account/admin/product/add")
    public String AdminAddClock(@RequestParam String clock_title, @RequestParam String clock_category,
                                  @RequestParam String clock_description, @RequestParam Double clock_price,
                                  @RequestParam String clock_movement, @RequestParam String clock_material,
                                  @RequestParam String clock_dimensions, @RequestParam Double clock_weight,
                                  @RequestParam String clock_img, @RequestParam String clock_other_info,
                                  Model model) {

        ClockEntity newClock = new ClockEntity(clock_title, clock_category, clock_description,
                clock_price, clock_movement, clock_material, clock_dimensions, clock_weight, clock_img,
                clock_other_info);

        clockRepository.save(newClock);
        return "redirect:/account";
    }

    @PostMapping("/account/admin/product/{id}/edit")
    public String AdminEditClock(@PathVariable(value = "id") Integer id, @RequestParam String clock_title,
                                   @RequestParam String clock_category, @RequestParam String clock_description,
                                   @RequestParam Double clock_price, @RequestParam String clock_movement,
                                   @RequestParam String clock_material, @RequestParam String clock_dimensions,
                                   @RequestParam Double clock_weight, @RequestParam String clock_img,
                                   @RequestParam String clock_other_info, Model model) {

        ClockEntity clock = clockRepository.findById(id).orElseThrow();

        clock.setTitle(clock_title);
        clock.setCategory(clock_category);
        clock.setDescription(clock_description);
        clock.setPrice(clock_price);
        clock.setMovement(clock_movement);
        clock.setMaterial(clock_material);
        clock.setDimensions(clock_dimensions);
        clock.setWeight(clock_weight);
        clock.setImgRef(clock_img);
        clock.setOtherInfo(clock_other_info);

        clockRepository.save(clock);
        return "redirect:/account";
    }

    @PostMapping("/account/admin/product/{id}/delete")
    public String AdminDeleteClock(@PathVariable(value = "id") Integer id, Model model) {

        ClockEntity clock = clockRepository.findById(id).orElseThrow();
        clockRepository.delete(clock);
        return "redirect:/account";
    }
}
