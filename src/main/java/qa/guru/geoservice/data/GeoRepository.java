package qa.guru.geoservice.data;

import org.springframework.data.repository.CrudRepository;
import qa.guru.geoservice.data.entity.GeoEntity;

import java.util.UUID;

public interface GeoRepository extends CrudRepository<GeoEntity, UUID> {
}
