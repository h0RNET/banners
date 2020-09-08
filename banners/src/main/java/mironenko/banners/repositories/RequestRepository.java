package mironenko.banners.repositories;

import mironenko.banners.models.Category;
import mironenko.banners.models.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Integer> {
}
