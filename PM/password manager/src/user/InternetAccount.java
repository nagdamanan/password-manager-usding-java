package user;

public class InternetAccount extends Account {

    private String domain;

    public InternetAccount(String domain, String username, String password) {
        super(username, password);
        this.domain = domain;
    }

    /**
     * @return Returns the domain for this InternetAccount.
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Changes this InternetAccount's domain.
     *
     * @param domain
     */
    public void changeDomain(String domain) { this.domain = domain; }
}
