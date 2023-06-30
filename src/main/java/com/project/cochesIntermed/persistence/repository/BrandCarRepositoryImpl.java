package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.persistence.mapper.mapper.IntBrandCarMapper;
import com.project.cochesIntermed.domain.dto.BrandCarDto;
import com.project.cochesIntermed.domain.repository.IntBrandCarRpository;
import com.project.cochesIntermed.persistence.entity.BrandCarEntity;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //crea constructor con los atributos final
//@NoArgsConstructor
@Repository
public class BrandCarRepositoryImpl implements IntBrandCarRpository {
    /**
     * Crud de marca coche
     * final ->  el objeto nunca va a cambiar
     */
    private final IntBrandCarCrudRepository intBrandCarCrudRepository;
    /**
     * Mapper de marca coche
     */
    private final IntBrandCarMapper intBrandCarMapper;

    @Override
    public List<BrandCarDto> getAll() {
        return intBrandCarMapper.toMarcasCochePojo(intBrandCarCrudRepository.findAll());
    }

    /**
     *
     * @param id Id de marca coche
     * @return d
     */
    @Override
    public Optional<BrandCarDto> getBrandCar(Integer id) {
        return intBrandCarCrudRepository.findById(id)
                //.map(brandCarEntity -> intBrandCarMapper.toMarcaCochePojo(brandCarEntity));
                .map(intBrandCarMapper::toMarcaCochePojo);  //Metodo por referencia
    }

    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {
        BrandCarEntity brandCarEntity = intBrandCarMapper.toMarcaCocheEntity(newBrandCar);
        return intBrandCarMapper.toMarcaCochePojo(intBrandCarCrudRepository.save(brandCarEntity));
    }

    @Override
    public void delete(Integer idBrandCar) {
    intBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
