package com.ynshb.controller;

import com.ynshb.model.dto.TaskManagerResponseDto;
import com.ynshb.service.TaskManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/api/v1/task-manager")
@RequiredArgsConstructor
public class TaskManagerController {

    private final TaskManagerService taskManagerService;

    @GetMapping
    public ResponseEntity<String> getRandomTaskName() {
        Random rnd = new Random();
        return ResponseEntity.ok(String.format("task-%d", rnd.nextInt()));
    }

    @GetMapping("/all")
    public ResponseEntity<List<TaskManagerResponseDto>> getAllTasks() {
        return ResponseEntity.ok(taskManagerService.getAllTasks());
    }
}
