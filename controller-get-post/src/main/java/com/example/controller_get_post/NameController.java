package com.example.controller_get_post;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping
    public String reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
