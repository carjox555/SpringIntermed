package com.project.cochesIntermed.controller;

import com.project.cochesIntermed.domain.dto.BrandCarDto;
import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.useCase.IcarUseCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(path = "/cars")
public class CarController {
    private IcarUseCase icarUseCase;

    @GetMapping
    public ResponseEntity<List<CarDto>> getAll() {
        return ResponseEntity.ok(icarUseCase.getAll());
    }

    @GetMapping(path = "/{idBrandCar}")
    public ResponseEntity<List<CarDto>> getBrandCar(@PathVariable Integer idBrandCar ) {
        return ResponseEntity.ok(icarUseCase.getByIdBrandCar(idBrandCar));
    }

    @GetMapping(path = "/{priceCar}")
    public ResponseEntity<List<CarDto>> getCarsByPriceLessThan(@PathVariable Double priceCar ) {
        return ResponseEntity.ok(icarUseCase.getCarsByPriceLessThan(priceCar));
    }

    @PostMapping()
    public ResponseEntity<CarDto> save(@RequestBody CarDto carDtoNew){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(icarUseCase.save(carDtoNew));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(path = "/{cardId}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer cardId){
        return  new ResponseEntity<>(this.icarUseCase.delete(cardId) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}
