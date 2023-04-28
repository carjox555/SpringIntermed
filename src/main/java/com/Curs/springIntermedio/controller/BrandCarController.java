package com.Curs.springIntermedio.controller;

import com.Curs.springIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.springIntermedio.domain.service.IntBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marca-coches")
public class BrandCarController {
    private final IntBrandCarService iBranchCarService;


    public List<BrandCarPojo> getAll() {

        return iBranchCarService.getAll();
    }

}
