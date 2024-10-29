package com.example.demo.service;

import com.example.demo.bean.Compte;
import com.example.demo.bean.Operation;
import com.example.demo.dao.CompteDao;
import com.example.demo.dao.OperationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompteService {

    @Autowired
    private CompteDao dao;
    @Autowired
    private OperationService operationService;

    public Compte findByRib(String rib) {
        return dao.findByRib(rib);
    }

    @Transactional
    int deleteWithAssociatedOperations(String rib) {
        int resOperations = operationService.deleteByCompteRib(rib);
        int resCompte = dao.deleteByRib(rib);
        return resCompte + resOperations;
    }

    public int save(Compte compte) {
        if (findByRib(compte.getRib()) != null) {
            return -1;
        } else if (compte.getSolde() <= 0) {
            return -2;
        } else {
            dao.save(compte);
            return 1;
        }
    }

    public List<Compte> findAll() {
        return dao.findAll();
    }

    public void update(Compte compte) {
        dao.save(compte);
    }
}
