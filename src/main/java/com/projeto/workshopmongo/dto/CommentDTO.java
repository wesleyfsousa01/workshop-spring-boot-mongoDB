package com.projeto.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1l;
    private String text;
    private Date date;
    private AuthorDTO getAuthorDTO;

    public CommentDTO() {
    }

    public CommentDTO(String text, Date date, AuthorDTO getAuthorDTO) {
        this.text = text;
        this.date = date;
        this.getAuthorDTO = getAuthorDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getGetAuthorDTO() {
        return getAuthorDTO;
    }

    public void setGetAuthorDTO(AuthorDTO getAuthorDTO) {
        this.getAuthorDTO = getAuthorDTO;
    }
}
