package com.onboarding.test.zoloz.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@NoArgsConstructor
public class FileRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String  id;
    private String filenames;
}
