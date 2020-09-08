package mironenko.banners.repositories;

import mironenko.banners.models.Banner;
import org.springframework.data.repository.CrudRepository;

/*Наследуемся от интерфейса CrudRepository, чтобы иметь возможность работать с методами,
которые позволяют управлять БД */
public interface BannerRepository extends CrudRepository<Banner, Integer> {
}
