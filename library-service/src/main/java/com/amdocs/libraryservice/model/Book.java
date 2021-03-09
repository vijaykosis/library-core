package com.amdocs.libraryservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "category_id ", length = 50, nullable = false)
    private String category_id ;
    @Column(name = "serialName", length = 50, nullable = false)
    private String serialName;

    @Column(name = "description", length = 250, nullable = false)
    private String description;
    @Column(name = "publication_year", nullable = false)
    private String publication_year;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "books_authors", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "author_id")})
    @JsonIgnore
    private Set<Author> authors = new HashSet<Author>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "books_categories", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "category_id")})
    @JsonIgnore
    private Set<Category> categories = new HashSet<Category>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "books_libraries", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {
            @JoinColumn(name = "library_id")})
    @JsonIgnore
    private Set<Library> libraries = new HashSet<Library>();

}