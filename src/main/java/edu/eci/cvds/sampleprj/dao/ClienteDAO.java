package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Cliente;

public interface ClienteDAO {
    public void save(Cliente cliente) throws PersistenceException;

    public Cliente load(int documento) throws PersistenceException;
}
