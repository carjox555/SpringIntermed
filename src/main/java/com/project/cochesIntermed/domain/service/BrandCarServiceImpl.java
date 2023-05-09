package com.project.cochesIntermed.domain.service;

<<<<<<< HEAD:src/main/java/com/Curs/springIntermedio/domain/service/BrandCarServiceImpl.java
import com.Curs.springIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.springIntermedio.domain.repository.IntBrandCarRpository;
=======
import com.project.cochesIntermed.domain.pojo.BrandCarPojo;
import com.project.cochesIntermed.domain.repository.IntBrandCarRpository;
import lombok.RequiredArgsConstructor;
>>>>>>> 11566f72315b27ac6f278bbc79dec6fc8dd5c477:src/main/java/com/project/cochesIntermed/domain/service/BrandCarServiceImpl.java
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class BrandCarServiceImpl implements IntBrandCarService {

    private final IntBrandCarRpository intBrandCarRpository;
    public BrandCarServiceImpl(IntBrandCarRpository intBrandCarRpository) {
        // Constructor vacío necesario para inicializar intBrandCarRpository
        this.intBrandCarRpository = intBrandCarRpository;
    }



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