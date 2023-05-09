package com.project.cochesIntermed.controller;

import com.project.cochesIntermed.domain.service.IntBrandCarService;
import com.project.cochesIntermed.domain.pojo.BrandCarPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
<<<<<<< HEAD:src/main/java/com/Curs/springIntermedio/controller/BrandCarController.java
=======

>>>>>>> 11566f72315b27ac6f278bbc79dec6fc8dd5c477:src/main/java/com/project/cochesIntermed/controller/BrandCarController.java

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marca-coches")
public class BrandCarController {
    private final IntBrandCarService intBrandCarService;




    @GetMapping
    public ResponseEntity<List<BrandCarPojo>> getAll() {
        return ResponseEntity.ok(intBrandCarService.getAll());
        //return ResponseEntity.status(HttpStatus.OK)
          //      .body(iBranchCarService.getAll());
        //return new ResposeEntity<>(iBrandCarService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar(@PathVariable Integer id ) {
        return ResponseEntity.of(intBrandCarService.getBrandCar(id));
    }

    @PostMapping
    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo brandCarPojoNew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(intBrandCarService.save(brandCarPojoNew));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PutMapping
    public ResponseEntity<BrandCarPojo>update(@RequestBody BrandCarPojo brandCarPojoUpdate){
        return ResponseEntity.status(HttpStatus.OK)
                .body(intBrandCarService.save(brandCarPojoUpdate));
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> delete(@PathVariable Integer id){
    return  new ResponseEntity<>(this.intBrandCarService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
