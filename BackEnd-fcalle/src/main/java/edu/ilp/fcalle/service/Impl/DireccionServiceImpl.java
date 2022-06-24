package edu.ilp.fcalle.service.Impl;

import edu.ilp.fcalle.dao.IDireccionDao;
import edu.ilp.fcalle.entity.Direccion;
import edu.ilp.fcalle.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    IDireccionDao direccionDao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.direccionDao.obtenerDireccionPorCodigo(codigo);
    }
}
