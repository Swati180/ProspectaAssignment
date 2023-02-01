package com.entry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entry.model.Entry;

public interface MainRepo extends JpaRepository<Entry, Integer>{

}
