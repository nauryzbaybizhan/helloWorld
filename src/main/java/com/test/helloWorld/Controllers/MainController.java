package com.test.helloWorld.Controllers;

import com.test.helloWorld.Entities.Word;
import com.test.helloWorld.Mappers.WordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    WordMapper wordMapper;

    @GetMapping("/")
    public Word greeting() {
        Word word = wordMapper.getWord(1L);
        return word;
    }
}
