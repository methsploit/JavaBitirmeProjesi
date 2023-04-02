package com.mehmeteminturkoglu.javabitirme.controller;

import com.mehmeteminturkoglu.javabitirme.dao.DaoMytable;
import com.mehmeteminturkoglu.javabitirme.service.MytableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class DbController {

@Autowired
    MytableService service;


    @GetMapping("/mytables")
    public ResponseEntity<?> mytables() {
        List<DaoMytable> mytableList = service.getMyTables();
        return ResponseEntity.ok().body(mytableList);
    }
    @GetMapping("/mytable")
    public ResponseEntity<?> mytable(@RequestParam("id") Long id) {
        Optional<DaoMytable> mytableList = service.getMyTable(id);
        return ResponseEntity.ok().body(mytableList);
    }


    @PostMapping("/settable")
    public ResponseEntity<?> settable(@Validated @RequestBody DaoMytable Mytable){

        service.createMytable(Mytable);
        return ResponseEntity.ok().body("ok");
    }


    @DeleteMapping("/deletetable")
    public ResponseEntity<?> deletetable(@RequestParam("id") Long id){
        service.deleteMytable(id);
        return ResponseEntity.ok().body("ok");
    }

}
