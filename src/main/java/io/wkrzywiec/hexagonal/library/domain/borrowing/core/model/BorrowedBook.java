package io.wkrzywiec.hexagonal.library.domain.borrowing.core.model;

import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode
public class BorrowedBook implements Book {

    private final Long bookId;
    private final Long userId;
    private final Instant borrowedDate;

    public BorrowedBook(Long bookId, Long userId) {
        this.bookId = bookId;
        this.userId = userId;
        this.borrowedDate = Instant.now();
    }

    @Override
    public Long getIdAsLong() {
        return bookId;
    }

    public Long getAssignedUserIdAsLong(){
        return userId;
    }

    public Instant getBorrowedDateAsInstant(){
        return borrowedDate;
    }
}
