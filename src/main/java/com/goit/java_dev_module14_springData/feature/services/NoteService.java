package com.goit.java_dev_module14_springData.feature.services;

import com.goit.java_dev_module14_springData.feature.entities.Note;
import com.goit.java_dev_module14_springData.feature.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public Note add(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    public void update(Note note) {
        noteRepository.save(note);
    }

    public Note getById(long id) {
        return noteRepository.getReferenceById(id);
    }

    public List<Note> listAll() {
        return noteRepository.findAll();
    }
}
