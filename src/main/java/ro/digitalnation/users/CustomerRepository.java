package ro.digitalnation.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Users, Long> {

  List<Customer> findByLastName(String lastName);
  
  Customer findByUsername(String username);

  Customer findById(long id);
  
}
