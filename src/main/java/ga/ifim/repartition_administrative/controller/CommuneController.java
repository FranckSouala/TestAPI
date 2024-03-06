package ga.ifim.repartition_administrative.controller;

import ga.ifim.repartition_administrative.entity.Commune;
import ga.ifim.repartition_administrative.service.CommuneService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("commune")
public class CommuneController {
   public CommuneService communeService;

    public CommuneController(CommuneService communeService) {
        this.communeService = communeService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void create(@RequestBody Commune commune){
        this.communeService.create(commune);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Commune> search(){
        return this.communeService.search();
    }
}
