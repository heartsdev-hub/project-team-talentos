package com.club_deportivo.backend.Exception;

import java.time.LocalDateTime;

public class ErrorResponse <T>{
    private String message;
    private int status;
    private LocalDateTime timestamp;
    private String path;

    public ErrorResponse(String message, int status, LocalDateTime timestamp, String path) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
        this.path = path;
    }
}
