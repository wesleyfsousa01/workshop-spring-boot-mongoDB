package com.projeto.workshopmongo.domain;

import com.projeto.workshopmongo.dto.AuthorDTO;
import com.projeto.workshopmongo.dto.CommentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    private String id;
    private Date date;
    private  String title;
    private String body;
    private AuthorDTO author;
    private List<CommentDTO> commentsList = new ArrayList<>();

    public Post() {
    }

    public Post(String id, Date date, String title, String body, AuthorDTO author ) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public List<CommentDTO> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<CommentDTO> commentsList) {
        this.commentsList = commentsList;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
