package course.courseWork.controller;

import course.courseWork.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final UserService usersService;

    @PostMapping
    public ResponseEntity<Void> registration(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {
        usersService.registration(username, password);
        return ResponseEntity.ok().build();
    }

}

