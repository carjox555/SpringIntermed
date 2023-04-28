package com.Curs.springIntermedio.domain.service;

import com.Curs.springIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.springIntermedio.domain.repository.IntBrandCarRpository;
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
        return null;
    }

    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return Optional.empty();
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        return null;
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