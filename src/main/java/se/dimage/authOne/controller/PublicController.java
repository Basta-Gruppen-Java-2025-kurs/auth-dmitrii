package se.dimage.authOne.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.dimage.authOne.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {
    private final UserService userService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String currentUser = userService.getCurrentUserName();
        return ResponseEntity.ok("Hello, " + (currentUser == null ? "anonymous" : currentUser) + "!");
    }

    @GetMapping("/ehlo")
    public ResponseEntity<String> ehlo(Principal principal) {
        return ResponseEntity.ok("Hello, mighty " + (principal == null ? "anon" : principal.getName()) + "!\n" +
                (principal == null ? "" : principal.toString()));
    }
}
