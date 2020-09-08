package mironenko.banners.controllers;

import mironenko.banners.models.Banner;
import mironenko.banners.repositories.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    private final BannerRepository bannerRepository;

    @Autowired
    public MainController(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/banner/add")
    public String addBanner(Model model) {
        return "banner-add";
    }

    @PostMapping("/banner/add")
    public String addBannerPost(@RequestParam String name, @RequestParam double price, @RequestParam int id_category, @RequestParam String content, Model model) {
        Banner banner = new Banner(name, content, id_category, price);
        bannerRepository.save(banner); //добавить баннер в таблицу БД
        return "redirect:/banner/add";
    }


}
