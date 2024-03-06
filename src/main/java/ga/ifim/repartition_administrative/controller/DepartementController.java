package ga.ifim.repartition_administrative.controller;

import ga.ifim.repartition_administrative.entity.Departement;
import ga.ifim.repartition_administrative.service.DepartementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("departement")
public class DepartementController {
    private final DepartementService departementService;

    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void create (@RequestBody Departement departement){
        this.departementService.create(departement);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Departement> search(){
        return this.departementService.search();
    }
}
