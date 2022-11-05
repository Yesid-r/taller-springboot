package edu.uptc.apirest.services;

import java.util.List;
import java.util.Optional;

import edu.uptc.apirest.entities.Meet;
import edu.uptc.apirest.entities.Room;
import edu.uptc.apirest.repositories.SalasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class SalasService {

	@Autowired
    SalasRepository salaRepository;

    public List<Room> getSalas() {
        return salaRepository.findAll();
    }


    public Optional<Meet> getsalaById(Integer salaId) throws Exception {
        if (!salaRepository.existsById(salaId)) {
            throw new Exception("sala with id " + salaId + " not found");
        }
        return null;
    }



}