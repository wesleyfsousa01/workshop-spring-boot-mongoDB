package com.projeto.workshopmongo.config;


import com.projeto.workshopmongo.domain.Post;
import com.projeto.workshopmongo.domain.User;
import com.projeto.workshopmongo.dto.AuthorDTO;
import com.projeto.workshopmongo.repository.PostRepository;
import com.projeto.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instanciation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();


        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userRepository.saveAll(Arrays.asList(maria,alex,bob));

        Post post1 = new Post (null, sdf.parse("21/03/2018"), "Partiu viagem","Vou viajar para SP abraços", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("18/04/2023"),"Workshop muito bom!","Estou aprendendo bastante sobre Spring!", new AuthorDTO(bob));
        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1,post2));
        userRepository.save(maria);

    }
}
