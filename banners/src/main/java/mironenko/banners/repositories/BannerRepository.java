package mironenko.banners.repositories;

import mironenko.banners.models.Banner;
import org.springframework.data.repository.CrudRepository;

public interface BannerRepository extends CrudRepository<Banner, Integer> {
}
