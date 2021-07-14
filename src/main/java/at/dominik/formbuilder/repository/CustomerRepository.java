package at.dominik.formbuilder.repository;

import at.dominik.formbuilder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //ist eine override von dem Interface CRUD und findet alle daten von einer Datenbank.

    List<Customer>  findAll();





}
