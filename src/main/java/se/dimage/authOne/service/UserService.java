package se.dimage.authOne.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import se.dimage.authOne.dto.UserResponseDTO;
import se.dimage.authOne.model.AppUser;
import se.dimage.authOne.model.Role;
import se.dimage.authOne.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository repository;

    public List<UserResponseDTO> listAllUsers() {
        return repository.findAll().stream().map(user -> new UserResponseDTO(user.getId(), user.getUsername(), user.getRoles().stream().map(Role::getName).collect(Collectors.toSet()))).toList();
    }

    public AppUser getCurrentUser() {
        String username = getCurrentUserName();
        if (username != null) {
            return repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        } else {
            return null;
        }
    }

    public String getCurrentUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            return authentication.getName();
        } else {
            return null;
        }
    }
}
