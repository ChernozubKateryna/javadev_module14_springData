package com.goit.java_dev_module14_springData.feature.repository;

import com.goit.java_dev_module14_springData.feature.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
