package dev.mb.database.repo.postgre;

import dev.mb.database.entity.postgre.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressDao extends CrudRepository<Address, Integer> {
}
