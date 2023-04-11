package com.projeto.workshopmongo.resources;

import com.projeto.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UseResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User>lista =  new ArrayList<>();
        User maria = new User("1001","Maria Brown","Maria@gmail.com");
        User jose = new User("1002","José Carlos ","josec@gmail.com");
        User ana = new User("1003","Ana Clara ","clara@gmail.com");
        lista.addAll(Arrays.asList(maria,jose,ana));
        return ResponseEntity.ok().body(lista);
    }

}
