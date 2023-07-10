package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.persistence.mapper.mapper.IntBrandCarMapper;
import com.project.cochesIntermed.domain.dto.BrandCarDto;
import com.project.cochesIntermed.domain.repository.IntBrandCarRpository;
import com.project.cochesIntermed.persistence.entity.BrandCarEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor //crea constructor con los atributos final
//@NoArgsConstructor

@Repository
public class BrandCarRepositoryImpl implements IntBrandCarRpository {
    /**
     * Crud de marca coche
     * final ->  el objeto nunca va a cambiar
     */
    private final IBrandCarCrudRepository intBrandCarCrudRepository;
    /**
     * Mapper de marca coche
     */
    private final IntBrandCarMapper intBrandCarMapper;

    public BrandCarRepositoryImpl(IBrandCarCrudRepository intBrandCarCrudRepository, IntBrandCarMapper intBrandCarMapper) {
        this.intBrandCarCrudRepository = intBrandCarCrudRepository;
        this.intBrandCarMapper = intBrandCarMapper;
    }

    @Override
    public List<BrandCarDto> getAll() {
        return intBrandCarMapper.toMarcasCocheDto(intBrandCarCrudRepository.findAll());
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
                .map(intBrandCarMapper::toMarcaCocheDto);  //Metodo por referencia
    }

    @Override
    public BrandCarDto save(BrandCarDto newBrandCar) {
        BrandCarEntity brandCarEntity = intBrandCarMapper.toMarcaCocheEntity(newBrandCar);
        return intBrandCarMapper.toMarcaCocheDto(intBrandCarCrudRepository.save(brandCarEntity));
    }

    @Override
    public void delete(Integer idBrandCar) {
    intBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
