package io.github.victor_vn.jpa_query_article_test.service;

import io.github.victor_vn.jpa_query_article_test.domain.ParceiroRequestParams;
import io.github.victor_vn.jpa_query_article_test.repository.ParceiroEntity;
import io.github.victor_vn.jpa_query_article_test.repository.ParceiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParceiroService {

    private final ParceiroRepository repository;

    public ParceiroService(ParceiroRepository repository) {
        this.repository = repository;
    }

    public ParceiroEntity findByParams(ParceiroRequestParams params){
        if (params.getCpf() != null && params.getEstado() == null && params.getNome() == null)
            return repository.findByCpf(params.getCpf());

        if (params.getCpf() == null && params.getNome() != null && params.getEstado() != null)
            return repository.findByCpfAndNome(params.getCpf(), params.getNome());

        throw new IllegalArgumentException("Parâmetros informados não correspondem a nenhuma combinação permitida.");
    }

    public ParceiroEntity findByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public ParceiroEntity findByCpfAndNome(String cpf, String nome){
        return repository.findByCpfAndNome(cpf, nome);
    }

    // demais combinações abaixo

    public List<ParceiroEntity> findBySearchDynamic(ParceiroRequestParams params){
        return repository.searchEmpresas(params);
    }
}
