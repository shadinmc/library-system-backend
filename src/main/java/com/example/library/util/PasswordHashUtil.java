package com.example.library.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHashUtil {

    private static final BCryptPasswordEncoder encoder =
            new BCryptPasswordEncoder();

    // Generate BCrypt hash
    public static String hash(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    // Verify password against hash
    public static boolean matches(String rawPassword, String hashedPassword) {
        return encoder.matches(rawPassword, hashedPassword);
    }

    // Quick manual test
    public static void main(String[] args) {
        String password = "admin123";

        String hash = hash(password);
        System.out.println("Generated Hash:");
        System.out.println(hash);

        System.out.println("Matches admin123? " +
                matches("admin123", hash));

        System.out.println("Matches wrong123? " +
                matches("wrong123", hash));
    }
}