package com.example.bookReview.authentication;

public record AuthenticationRequestDto(
        String username,
        String password
) {
}
