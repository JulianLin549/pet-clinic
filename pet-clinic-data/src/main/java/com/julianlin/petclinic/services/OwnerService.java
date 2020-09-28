package com.julianlin.petclinic.services;

import com.julianlin.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
