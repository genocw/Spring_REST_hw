package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<File, Long> {
}