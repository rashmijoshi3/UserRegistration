package com.registration.service;

import org.springframework.stereotype.Service;

/**
 * Service to offer validation of a user against an exclusion list.
 * @author gamesys
 */


@Service
public interface ExclusionService {
    /**
     * Validates a user against an exclusion list using their date of
     * birth and social security number as identifier.
     *
     * @param dateOfBirth the user's date of birth in ISO 8601 format
     * @param ssn the user's social security number (United States)
     * @return true if the user is not excluded
     */
    boolean validate(String dateOfBirth, String ssn);
}

