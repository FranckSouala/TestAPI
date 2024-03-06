package ga.ifim.repartition_administrative.service;

import ga.ifim.repartition_administrative.entity.Commune;
import ga.ifim.repartition_administrative.repository.CommuneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommuneService{
    private final CommuneRepository communeRepository;

    public CommuneService(CommuneRepository communeRepository) {
        this.communeRepository = communeRepository;
    }

    public void create (Commune commune){
        this.communeRepository.save(commune);
    }

    public List<Commune> search (){
       return this.communeRepository.findAll();
    }
}
