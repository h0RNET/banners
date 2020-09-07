package mironenko.banners.controllers;

import mironenko.banners.models.Banner;
import mironenko.banners.repositories.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    private final BannerRepository bannerRepository;
    @Autowired
    public MainController(BannerRepository bannerRepository) {
        this.bannerRepository = bannerRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Banner> banners = bannerRepository.findAll();
        model.addAttribute("banners", banners);
        return "home";
    }

}
