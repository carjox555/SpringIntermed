package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.dto.BrandCarDto;
import com.project.cochesIntermed.domain.repository.IntBrandCarRpository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor

@Service
public class BrandCarServiceImpl implements IntBrandCarService {

    private final IntBrandCarRpository intBrandCarRpository;

    public BrandCarServiceImpl(IntBrandCarRpository intBrandCarRpository) {
        this.intBrandCarRpository = intBrandCarRpository;
    }


    @Override
    public List<BrandCarDto> getAll() {
        return intBrandCarRpository.getAll();
    }

    @Override
    public Optional<BrandCarDto> getBrandCar(Integer id) {
        return intBrandCarRpository.getBrandCar(id);
    }

    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {

        return intBrandCarRpository.save(newBrandCar);
    }

    @Override
    public Optional<BrandCarDto> update(BrandCarDto newBrandcar) {
        if  (intBrandCarRpository.getBrandCar(newBrandcar.getId()).isEmpty()){
            return  Optional.empty();
        }
        return Optional.of(intBrandCarRpository.save(newBrandcar));
    }


    @Override
    public Boolean delete(Integer idBrandCar) {
        if(intBrandCarRpository.getBrandCar(idBrandCar).isEmpty()){
            return true;
        }intBrandCarRpository.delete(idBrandCar);
            return false;

        }


    }
