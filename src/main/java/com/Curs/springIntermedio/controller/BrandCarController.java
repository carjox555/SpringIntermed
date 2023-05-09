package com.Curs.springIntermedio.controller;

import com.Curs.springIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.springIntermedio.domain.service.IntBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marca-coches")
public class BrandCarController {
    private final IntBrandCarService intBrandCarService;


    @GetMapping()
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
