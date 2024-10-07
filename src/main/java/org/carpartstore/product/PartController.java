package org.carpartstore.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class PartController {
    private final PartRepository partRepo;

    public PartController(PartRepository partRepo) {
        this.partRepo = partRepo;
    }

    @GetMapping()
    public List<Part> getParts() {
        List<Part> partsList = partRepo.findAll();
        return partsList;
    }
}