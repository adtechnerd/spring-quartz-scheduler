package com.learning.repoModel;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue()
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    public User() {
        super();
    }
}
