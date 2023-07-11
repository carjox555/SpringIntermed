package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.dto.ResponseCustomerDto;
import com.project.cochesIntermed.domain.repository.IntCustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class CustomerServiceImp implements ICustomerService {
    private final IntCustomerRepository intCustomerRepository;


    @Override
    public List<CustomerDto> getAll() {
        return intCustomerRepository.getAll();
    }

    @Override
    public Optional<CustomerDto> getCustomerByCardId(String cardId) {
        return intCustomerRepository.getCustomerByCardId(cardId);
    }

    @Override
    public Optional<CustomerDto> getCustomerByEmail(String email) {
        return intCustomerRepository.getCustomerByEmail(email);
    }

    @Override
    public ResponseCustomerDto save(CustomerDto newCustomer) {
        String passwordGenerate= generateRandomPassword(8)
        newCustomer.setPassword(generateRandomPassword(8));
        newCustomer.setActive(1);
        intCustomerRepository.save(newCustomer);
        return;
    }

    @Override
    public Optional<CustomerDto> update(CustomerDto modifyCustomer) {
        if (intCustomerRepository.getCustomerByCardId(modifyCustomer.getCardId()).isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(intCustomerRepository.save(modifyCustomer));
    }

    @Override
    public boolean delete(String cardId) {
        if(intCustomerRepository.getCustomerByCardId(cardId).isEmpty()){
            return true;
        }intCustomerRepository.delete(cardId);
        return false;

    }
    /*
      Metodo para generar una contraseña alfanumerica aleatoria
       */
    private String generateRandomPassword(int len){
        final String chars ="AZSXCDFVBGHNMJKLÑPOIUYTREWQ1234567890asdfghjklmnbvcxzqwertyuiop";
        SecureRandom random = new SecureRandom();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return  sb.toString();
    }

    }

