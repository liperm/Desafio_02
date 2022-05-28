package com.br.saks.interesse.interesseservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Interesse {
    @EmbeddedId
    private InteresseIdentity interesseIdentity;
}
