package ro.digitalnation.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Users, Long> {
	
	List<Administrator> findByLastName(String lastName);
	
	Administrator findByUsername(String username);
	
	Administrator findById(long id);
	
}
