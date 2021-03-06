package com.bookstore.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Data
public class Book implements Serializable {

    private Long id;

    private String author;

    private String description;

    private String isbn;

    private Date lastUpdate;

    private String title;

    private BigDecimal price;

    private Integer quantity;

    private String category;

    private Long coverId;

    private Long categoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
