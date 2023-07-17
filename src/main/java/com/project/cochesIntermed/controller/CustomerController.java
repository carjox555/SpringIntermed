package com.project.cochesIntermed.controller;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.dto.ResponseCustomerDto;
import com.project.cochesIntermed.domain.useCase.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping(path = "/customers")
public class CustomerController {
    private ICustomerService iCustomerService;

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAll() {
        return ResponseEntity.ok(iCustomerService.getAll());
    }

    @GetMapping(path = "/{cardId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable String cardId ) {
        return ResponseEntity.of(iCustomerService.getCustomerByCardId(cardId));
    }

    @GetMapping(path = "/{email}")
    public ResponseEntity<CustomerDto> getCustomerByEmail(@PathVariable String email ) {
        return ResponseEntity.of(iCustomerService.getCustomerByEmail(email));
    }

    @PostMapping()
    public ResponseEntity<ResponseCustomerDto> save(@RequestBody CustomerDto customerDtoNew){

            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iCustomerService.save(customerDtoNew));

        }


    @PatchMapping()
    public ResponseEntity<CustomerDto>update(@RequestBody CustomerDto customerDtoUpdate){
        return ResponseEntity.of(iCustomerService.update(customerDtoUpdate));
    }

    @DeleteMapping(path = "/{cardId}")
    public ResponseEntity<Boolean> delete(@PathVariable String cardId){
        return  new ResponseEntity<>(this.iCustomerService.delete(cardId) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}

