package ga.ifim.repartition_administrative.repository;

import ga.ifim.repartition_administrative.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> { }
