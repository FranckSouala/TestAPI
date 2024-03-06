package ga.ifim.repartition_administrative.controller;

import ga.ifim.repartition_administrative.entity.Province;
import ga.ifim.repartition_administrative.service.ProvinceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "province")
public class ProvinceController {
private  final ProvinceService provinceService;

    public ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void create(@RequestBody Province province){
        this.provinceService.create(province);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Province> search(){
        return this.provinceService.search();
    }

    @GetMapping(path = "{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public Province read(@PathVariable int id){
        return this.provinceService.read(id);
    }
}
