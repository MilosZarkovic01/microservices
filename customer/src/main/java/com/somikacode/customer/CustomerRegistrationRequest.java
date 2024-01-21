package com.somikacode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
