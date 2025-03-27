package io.github.victor_vn.jpa_query_article_test.repository;

import io.github.victor_vn.jpa_query_article_test.domain.ParceiroRequestParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParceiroRepository extends JpaRepository<ParceiroEntity, String> {

    ParceiroEntity findByCpf(String cpf);

    ParceiroEntity findByCpfAndNome(String cpf, String nome);

    // demais combinações abaixo

    @Query("SELECT e FROM ParceiroEntity e " +
            "WHERE ((:#{#params.cpf} IS NULL OR :#{#params.cpf} = '') OR e.cpf = :#{#params.cpf}) " +
            "AND ((:#{#params.nome} IS NULL OR :#{#params.nome} = '') OR LOWER(e.nome) LIKE LOWER(CONCAT('%', :#{#params.nome}, '%'))) " +
            "AND ((:#{#params.estado} IS NULL OR :#{#params.estado} = '') OR LOWER(e.estado) LIKE LOWER(CONCAT('%', :#{#params.estado}, '%'))) " +
            "AND ((:#{#params.numero} IS NULL) OR e.numeroFuncionarios = :#{#params.numero})")
    List<ParceiroEntity> searchEmpresas(@Param("params") ParceiroRequestParams params);
}
