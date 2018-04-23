package de.digitalpub.controller.form;

import com.sun.istack.internal.NotNull;

public class SignUpForm {


    @NotNull
    private String email;

    @NotNull
    private String nickname;

    @NotNull
    private String password;

    @NotNull
    private String repeatedPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }
}
