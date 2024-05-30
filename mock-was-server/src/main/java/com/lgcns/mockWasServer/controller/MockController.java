package com.lgcns.mockWasServer.controller;

import com.lgcns.mockWasServer.util.ResponseUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/mock")
@EnableWebMvc
@AllArgsConstructor
@Slf4j
public class MockController {


    @GetMapping("{cnt}")
    public ResponseEntity retrieveReports(@PathVariable int cnt) {
        double value = 0;
        for (int i = 0; i < cnt; i++) {
            value += Math.sin(i) * Math.cos(i);
        }
        log.info("mock Request");
        return ResponseUtil.createSuccessResponse("success");
    }

}
