package tes.com.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tes.com.backend.entities.Test;
import tes.com.backend.models.ResponseModel;
import tes.com.backend.respositories.TestRepository;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/test")
public class testController {
    @Autowired
    TestRepository testRepository;

    @GetMapping
    ResponseEntity<List<Test>> get(){
       List<Test> tests = testRepository.findAll();
        return ResponseEntity.ok(tests);
    }

    @GetMapping("/save")
    ResponseEntity<Test> save(){
        Test test = new Test();
        System.out.println(test);
       test = testRepository.save(test);
        return ResponseEntity.ok(test);
    }
}
