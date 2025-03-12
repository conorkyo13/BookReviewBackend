package com.example.bookReview.registration;

public record RegistrationRequestDto(
        String username,
        String email,
        String password
) {
}
