package com.amanicb.apps.rest.repository;

import com.amanicb.apps.rest.entity.supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface supplierRepo extends JpaRepository<supplier,Long>{



}
