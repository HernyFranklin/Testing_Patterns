package com.testing.test.agencia.infrastructure;

import com.testing.test.agencia.domain.Agencia;
import com.testing.test.agencia.domain.AgenciaRepository;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author: Herny Franklin Choque Huanca
 * @vDate: 31/7/2020
 */
public class InMemoryAgenciaRepository implements AgenciaRepository {
    private HashMap<Long,Agencia> agencias = new HashMap<>();

    @Override
    public void save(Agencia agencia) {
        agencias.put(agencia.getIdAgencia(),agencia);
    }

    @Override
    public Optional<Agencia> search(Long id) {
        return Optional.ofNullable(agencias.get(id));
    }
}
