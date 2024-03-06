package ga.ifim.repartition_administrative.service;

import ga.ifim.repartition_administrative.entity.Province;
import ga.ifim.repartition_administrative.repository.ProvinceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {
    private final ProvinceRepository provinceRepository;

    public ProvinceService(ProvinceRepository provinceRepository){
        this.provinceRepository = provinceRepository;
    }

    public void create(Province province){
        this.provinceRepository.save(province);
    }

    public List<Province> search(){
        return this.provinceRepository.findAll();
    }

    public Province read(int id) {
       var provinceInDB = this.provinceRepository.findById(id);
        return provinceInDB.orElse(null);
    }

}
