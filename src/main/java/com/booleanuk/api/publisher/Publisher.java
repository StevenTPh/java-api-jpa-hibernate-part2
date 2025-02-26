package com.booleanuk.api.publisher;

import com.booleanuk.api.book.Book;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

//    @OneToMany(mappedBy = "publisher")
//    @JsonIncludeProperties(value =  {"id", "name", "location"})
//    private List<Book> books;


    public Publisher(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
