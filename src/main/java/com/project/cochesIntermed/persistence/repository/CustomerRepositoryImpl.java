package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.repository.IntCustomerRepository;
import com.project.cochesIntermed.persistence.entity.BrandCarEntity;
import com.project.cochesIntermed.persistence.entity.CustomerEntity;
import com.project.cochesIntermed.persistence.mapper.mapper.IntCustomerMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@AllArgsConstructor
@Repository
public class CustomerRepositoryImpl implements IntCustomerRepository {

    private  ICustomerCrudRepository iCustomerCrudRepository;
    private  IntCustomerMapper intCustomerMapper;

    @Override
    public List<CustomerDto> getAll() {
        return intCustomerMapper.toCustomersDtoList(iCustomerCrudRepository.findAll());
    }

    @Override
    public Optional<CustomerDto> getCustomerByCardId(String cardId) {

        return iCustomerCrudRepository.findById(cardId)
                .map(intCustomerMapper::toCustomerDto);
    }

    @Override
    public Optional<CustomerDto> getCustomerByEmail(String email) {

        return iCustomerCrudRepository.findByEmailCustomer(email)
                .map(intCustomerMapper::toCustomerDto);
    }

    @Override
    public CustomerDto save(CustomerDto newCustomer) {
        return intCustomerMapper.toCustomerDto(iCustomerCrudRepository.save(intCustomerMapper.toCustomerEntity(newCustomer)));
    }

    @Override
    public void delete(String cardId) {
        iCustomerCrudRepository.deleteById(cardId);
    }
}
