package com.project.cochesIntermed.controller;

import com.project.cochesIntermed.domain.service.IntBrandCarService;
import com.project.cochesIntermed.domain.dto.BrandCarDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping(path = "/marca-coches")
public class BrandCarController {

    private IntBrandCarService intBrandCarService;

    @GetMapping
    public ResponseEntity<List<BrandCarDto>> getAll() {
        return ResponseEntity.ok(intBrandCarService.getAll());
        //return ResponseEntity.status(HttpStatus.OK)
          //      .body(iBranchCarService.getAll());
        //return new ResposeEntity<>(iBrandCarService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarDto> getBrandCar(@PathVariable Integer id ) {
        return ResponseEntity.of(intBrandCarService.getBrandCar(id));
    }

    @PostMapping()
    public ResponseEntity<BrandCarDto> save(@RequestBody BrandCarDto brandCarPojoNew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(intBrandCarService.save(brandCarPojoNew));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PatchMapping()
    public ResponseEntity<BrandCarDto>update(@RequestBody BrandCarDto brandCarPojoUpdate){
        return ResponseEntity.of(intBrandCarService.update(brandCarPojoUpdate));

    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<BrandCarDto> delete(@PathVariable Integer id){
    return  new ResponseEntity<>(this.intBrandCarService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
