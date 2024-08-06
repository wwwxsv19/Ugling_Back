package org.example.backendstudy.domain.item.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.backendstudy.domain.item.Item;
import org.example.backendstudy.domain.item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/item")
    public ResponseEntity<?> getAllItems() {
        List<?> itemList = itemService.getAll();
        return ResponseEntity.ok().body(itemList);
    }
}
