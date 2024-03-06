package ga.ifim.repartition_administrative.repository;

import ga.ifim.repartition_administrative.entity.Commune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommuneRepository extends JpaRepository<Commune, Integer> {
}
