package com.iamneo.security.service;

import com.iamneo.security.entity.Model;
import com.iamneo.security.repository.Demorep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private final Demorep repo;

    @Autowired
    public Services(Demorep repo) {
        this.repo = repo;
    }

    public Model updateDataAmount(String id, double valueToAdd) {
        Model dataEntity = repo.findById(id)
                .orElseThrow();

        double currentAmount = dataEntity.getAmount();
        double updatedAmount = currentAmount + valueToAdd;

        dataEntity.setAmount(updatedAmount);
        return repo.save(dataEntity);
    }
    
    public Model ClaimAmount(String id, double valueToAdd) {
        Model dataEntity = repo.findById(id)
                .orElseThrow();

        double currentAmount = dataEntity.getAmount();
        double updatedAmount = currentAmount - valueToAdd;

        dataEntity.setAmount(updatedAmount);
        return repo.save(dataEntity);
    }
}
