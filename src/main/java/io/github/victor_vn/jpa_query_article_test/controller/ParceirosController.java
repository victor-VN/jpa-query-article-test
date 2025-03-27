package io.github.victor_vn.jpa_query_article_test.controller;

import io.github.victor_vn.jpa_query_article_test.domain.ParceiroRequestParams;
import io.github.victor_vn.jpa_query_article_test.repository.ParceiroEntity;
import io.github.victor_vn.jpa_query_article_test.service.ParceiroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParceirosController {

    private final ParceiroService service;

    public ParceirosController(ParceiroService service) {
        this.service = service;
    }

    @GetMapping("/parceiros")
    public ResponseEntity<List<ParceiroEntity>> getParceiros(ParceiroRequestParams params){
        return ResponseEntity.ok(service.findBySearchDynamic(params));
    }
}
