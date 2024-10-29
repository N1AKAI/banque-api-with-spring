package com.example.demo.dao;

import com.example.demo.bean.Operation;
import com.example.demo.bean.TypeOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationDao extends JpaRepository<Operation, Long> {

    Operation findByCode(String code);

    int deleteByCode(String code);

    List<Operation> findByCompteRib(String rib);
    int deleteByCompteRib(String rib);

}
