package dev.mb.database;


import dev.mb.database.entity.mysql.Person;
import dev.mb.database.entity.postgre.Address;
import dev.mb.database.repo.postgre.AddressDao;
import dev.mb.database.repo.mysql.PersonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DatabaseApplication implements CommandLineRunner{

	@Autowired
	private PersonDao personDao;

	@Autowired
	private AddressDao addressDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		log.info("initiating insertion");
		personDao.save(new Person(3,"Mr","Bruteforce27", 35));
		log.info("insertion completed");
		log.info("initiating insertion for address");
		addressDao.save(new Address(5, 2, "J-101110","sector-10110", "Mother board", "RAM", "CPU", "PC", "010110"));
		log.info("insertion completed for address");
	}
}
