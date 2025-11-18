package se.dimage.authOne.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class SecretController {
    @GetMapping("/secret")
    public ResponseEntity<String> secret() {
        return ResponseEntity.ok("Dis iz da sekrit");
    }
}
