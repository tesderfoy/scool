package com.example.scool.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Long id;

    private String name;
    private String surname;

}
