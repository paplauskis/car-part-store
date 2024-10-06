package org.carpartstore.part;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class PartController {
    private final PartRepository partRepo;

    public PartController(PartRepository partRepo) {
        this.partRepo = partRepo;
    }


}