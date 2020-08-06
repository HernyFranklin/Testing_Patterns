package com.testing.test.agencia.domain;

import java.util.Optional;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 31/7/2020
 */
public interface AgenciaRepository {
    void save(Agencia agencia);

    Optional<Agencia> search(Long id);
}
