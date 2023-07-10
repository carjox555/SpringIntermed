package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.repository.IntCustomerRepository;
import com.project.cochesIntermed.persistence.mapper.mapper.IntCustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class CustomerRepositoryImpl implements IntCustomerRepository {

    private  final ICustomerCrudRepository iCustomerCrudRepository;
    private final  IntCustomerMapper intCustomerMapper;

    @Override
    public List<CustomerDto> getAll() {
        return intCustomerMapper.toCustomersDtoList(iCustomerCrudRepository.findAll());
    }

    @Override
    public Optional<CustomerDto> getCustomerByCardId(String cardId) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerDto> getCustomerByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public CustomerDto save(CustomerDto newCustomer) {
        return null;
    }

    @Override
    public void delete(String cardId) {

    }
}
