package com.Curs.springIntermedio.persistence.repository;

import com.Curs.springIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.springIntermedio.domain.repository.IntBrandCarRpository;
import com.Curs.springIntermedio.persistence.entity.BrandCarEntity;
import com.Curs.springIntermedio.persistence.mapper.mapper.IntBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class BrandCarRepositoryImpl implements IntBrandCarRpository {
    /**
     * Crud de marca coche
     */
    private final IntBrandCarCrudRepository intBrandCarCrudRepository;
    /**
     * Mapper de marca coche
     */
    private final IntBrandCarMapper intBrandCarMapper;

    @Override
    public List<BrandCarPojo> getAll() {
        return intBrandCarMapper.toMarcasCochePojo(intBrandCarCrudRepository.findAll());
    }

    /**
     *
     * @param id Id de marca coche
     * @return
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return intBrandCarCrudRepository.findById(id)
                //.map(brandCarEntity -> intBrandCarMapper.toMarcaCochePojo(brandCarEntity));
                .map(intBrandCarMapper::toMarcaCochePojo);  //Metodo por referencia
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        BrandCarEntity brandCarEntity = intBrandCarMapper.toMarcaCocheEntity(newBrandCar);
        intBrandCarCrudRepository.save(brandCarEntity)
        return intBrandCarMapper.toMarcaCocheEntity();
    }

    @Override
    public void delete(Integer idBrandCar) {

    }
}
