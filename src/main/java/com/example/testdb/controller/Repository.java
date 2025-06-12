package com.example.testdb.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Messages, Long> {
}