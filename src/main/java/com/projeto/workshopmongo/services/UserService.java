package com.projeto.workshopmongo.services;

import com.projeto.workshopmongo.domain.User;
import com.projeto.workshopmongo.repository.UserRepository;
import com.projeto.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){
        Optional<User> obj= repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
