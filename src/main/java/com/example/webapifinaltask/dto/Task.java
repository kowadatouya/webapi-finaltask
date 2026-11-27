package com.example.webapifinaltask.dto;

import java.time.LocalDateTime;

@Data
public class Task {
    private int id;
    private String name;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
}
