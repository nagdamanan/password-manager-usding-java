package user;

public class Account {

    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * @return Returns the username of this Account.
     */
    public String getUserName() {
        return this.username;
    }

    /**
     * @return Returns the password of this Account.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Changes the password for this Account.
     * @param password
     */
    public void changePassword(String password) {
        this.password = password;
    }
}
