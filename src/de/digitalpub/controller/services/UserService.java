package de.digitalpub.controller.services;

import de.digitalpub.controller.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
