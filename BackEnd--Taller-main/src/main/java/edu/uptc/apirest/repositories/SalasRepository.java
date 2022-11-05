//paquete en el cual se guarda todos los controles de cada clase 
package edu.uptc.apirest.repositories;

//liberias importadas para la cardinalidad entre tablas
import edu.uptc.apirest.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//La anotación @Repository es una especialización de la anotación @Component que se utiliza para indicar que la clase proporciona el mecanismo para la operación de almacenamiento, recuperación, actualización, eliminación y búsqueda en objetos.
@Repository
//interface sala mediante la clave integer de sala
public interface SalasRepository extends JpaRepository<Room, Integer> {
	
	

}
