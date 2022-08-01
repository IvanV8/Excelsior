package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.service.ExcesliorService;
import ru.zeidler.excelsior.service.UserService;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {


    private final UserService userService;


    @GetMapping(value = "/getbyid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<UserDTO> getById(@PathVariable Long Id) {
             UserDTO user = userService.findById(Id);

        return ResponseEntity.ok()
                .body(user);
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getAll() {
        List<UserDTO> users = userService.findAll();
        return ResponseEntity.ok()
                .body(users);
    }

}
