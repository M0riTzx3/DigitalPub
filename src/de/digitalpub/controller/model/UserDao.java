package de.digitalpub.controller.model;

import de.digitalpub.controller.form.LoginForm;

public interface UserDao {

    void register(User user);

    User validateUser(LoginForm login);

}