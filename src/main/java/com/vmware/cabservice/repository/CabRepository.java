package com.vmware.cabservice.repository;

import com.vmware.cabservice.model.Cab;
import org.springframework.data.repository.CrudRepository;

public interface CabRepository  extends CrudRepository<Cab, Long> {
}
