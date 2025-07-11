package org.koreait.member.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @PostMapping("/join")
    public ResponseEntity<Object> join(@RequestBody @Valid RequestJoin form, Errors errors) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("header1", "value1");
        headers.add("header2", "value2");

        ResponseEntity<Object> res = new ResponseEntity<>(HttpStatus.NO_CONTENT);

        if (errors.hasErrors()) {
            List<String> errorMessages = errors.getFieldErrors().stream().map(e -> e.getDefaultMessage()).toList();

            res = new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST);
        }

        return res;
    }
}