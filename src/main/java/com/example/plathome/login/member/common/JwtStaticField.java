package com.example.plathome.login.member.common;

public class JwtStaticField {
    public static final String BEARER = "Bearer ";
    public static final String REFRESH_URL = "/token";

    public static final long ACCESS_TOKEN_EXPIRATION = 1000L * 60 * 15; // Access token is 15 minutes.
    public static final long REFRESH_TOKEN_EXPIRATION = 1000L * 60 * 60 * 24; // Refresh token is one day.
}
