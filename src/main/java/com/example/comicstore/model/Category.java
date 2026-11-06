package com.example.comicstore.model;

import jakarta.persistence.*;

@Entity
@Table (name = "categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false, length = 150)
    private String name;

    @Column (nullable = true, unique = true, length = 100)
    private String slug;

    protected Category() {
    }

    public Category(
        String name,
        String slug
    ) {
        this.name = name;
        this.slug = slug;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}
