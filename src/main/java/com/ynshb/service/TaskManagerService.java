package com.ynshb.service;

import com.ynshb.model.dto.TaskManagerResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class TaskManagerService {


    public List<TaskManagerResponseDto> getAllTasks() {
        List<TaskManagerResponseDto> tasksResult = new ArrayList<>();
        Stream.of("1-Task1-This task generally For Task1", "2-Task2-This task generally For Task2", "3-Task3-This task generally For Task3", "4-Task4-This task generally For Task4")
                .forEach(entry -> {
                    String[] splitedValues = entry.split("-", -1);
                    tasksResult.add(new TaskManagerResponseDto(Integer.valueOf(splitedValues[0]), splitedValues[1], splitedValues[2]));
                });
        return tasksResult;
    }
}
