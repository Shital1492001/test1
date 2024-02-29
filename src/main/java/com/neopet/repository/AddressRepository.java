package com.neopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neopet.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
