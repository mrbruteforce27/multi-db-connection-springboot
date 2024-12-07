package dev.mb.database.repo.mysql;

import dev.mb.database.entity.mysql.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Integer> {
}
