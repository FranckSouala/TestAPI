package ga.ifim.repartition_administrative.service;

import ga.ifim.repartition_administrative.entity.Departement;
import ga.ifim.repartition_administrative.repository.DepartementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService {
    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    public void create (Departement departement){
        this.departementRepository.save(departement);
    }

    public List<Departement> search (){
        return this.departementRepository.findAll();
    }

}
