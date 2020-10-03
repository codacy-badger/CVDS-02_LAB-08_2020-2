package edu.eci.cvds.sampleprj.dao.mybatis;

import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;

import javax.inject.Inject;

public class MyBATISClienteDAO implements ClienteDAO {
    @Inject
    private ClienteMapper clienteMapper;

    @Override
    public void save(Cliente cliente) throws PersistenceException {
        try {
            clienteMapper.insertarCliente(cliente);
        }
        catch (org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar cliente "+cliente.toString(),e);
        }
    }

    @Override
    public Cliente load(int documento) throws PersistenceException {
        return clienteMapper.consultarCliente(documento);
    }
}
