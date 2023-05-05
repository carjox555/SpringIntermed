package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.pojo.BrandCarPojo;
import com.project.cochesIntermed.domain.repository.IntBrandCarRpository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class BrandCarServiceImpl implements IntBrandCarService {

    private final IntBrandCarRpository intBrandCarRpository;


    @Override
    public List<BrandCarPojo> getAll() {
        return intBrandCarRpository.getAll();
    }

    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return intBrandCarRpository.getBrandCar(id);
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        return intBrandCarRpository.save(newBrandCar);
    }

    @Override
    public Boolean delete(Integer idBrandCar) {
        try {
            intBrandCarRpository.delete(idBrandCar);
            return true;
        }catch (Exception e){
            return false;

        }
    }
}