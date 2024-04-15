package UserTest;
public class User {
    private String username;
    private String password;
    private boolean locked;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.locked = false;
    }

    public boolean authenticate(String password) {
        return !locked && this.password.equals(password);
    }

    public boolean isLocked() {
        return locked;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        this.locked = false;
    }

    public void lockUser() {
        this.locked = true;
    }

    public void unlockUser() {
        this.locked = false;
    }
}
