package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.address;

public interface IAddressPersistence extends JpaRepository<address, String> {

}
