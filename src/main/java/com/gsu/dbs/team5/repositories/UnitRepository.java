package com.gsu.dbs.team5.repositories;

import com.gsu.dbs.team5.entities.Unit;
import com.gsu.dbs.team5.entities.UnitId;
import com.gsu.dbs.team5.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepository extends JpaRepository<Unit, UnitId> {  // Use Integer as the type for unitId
    
    List<Unit> findByProperty(Property property);  // Find units by the associated property
    long countByProperty_PropertyId(int propertyId);

}
