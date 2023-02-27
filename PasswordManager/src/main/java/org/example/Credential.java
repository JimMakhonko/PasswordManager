package org.example;

public class Credential {
    private String description;
    private String username;
    private String password;

    public String getDescription() {
        return description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setCredential(String desc, String usernm, String password) {
        this.description = desc;
        this.username = usernm;
        this.password = password;

    }

    public String[] getCredential() {
        return new String[]{getDescription(), getUsername(), getPassword()};
    }

    public String getInfo() {
        return "Info for the "+ getDescription() + " is: \n\t username: " + getUsername()
                + "\n\t password: " + getPassword();
    }
}
