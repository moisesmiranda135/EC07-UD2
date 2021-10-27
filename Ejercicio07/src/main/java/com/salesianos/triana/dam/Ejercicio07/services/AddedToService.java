package com.salesianos.triana.dam.Ejercicio07.services;



import com.salesianos.triana.dam.Ejercicio07.models.AddedTo;
import com.salesianos.triana.dam.Ejercicio07.models.AddedToPk;
import com.salesianos.triana.dam.Ejercicio07.repositories.AddedToRepository;
import com.salesianos.triana.dam.Ejercicio07.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService
        extends BaseService<AddedTo, AddedToPk, AddedToRepository> {
}
