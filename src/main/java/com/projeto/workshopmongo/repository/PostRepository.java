package com.projeto.workshopmongo.repository;

import com.projeto.workshopmongo.domain.Post;
import com.projeto.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
