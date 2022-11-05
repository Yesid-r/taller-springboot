package edu.uptc.apirest.repositories;

import edu.uptc.apirest.entities.Meet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
//interface Meet mediante la clave integer de Meet
public interface MeetRepository extends JpaRepository<Meet, Integer> {
	
	

}
