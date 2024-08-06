package org.example.backendstudy.domain.item.service;

import lombok.RequiredArgsConstructor;
import org.example.backendstudy.domain.item.grade.repository.GradeRepository;
import org.example.backendstudy.domain.item.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private final GradeRepository gradeRepository;

    public List<?> getAll() {
        return itemRepository.findAll();
    }
}
