package units;

public class Credentials {
    public String getActualUserName() {
        return actualUserName;
    }

    public void setActualUserName(String actualUserName) {
        this.actualUserName = actualUserName;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "actualUserName='" + actualUserName + '\'' +
                ", actualPassword='" + actualPassword + '\'' +
                '}';
    }

    public boolean compareCredentials(String userName, String password) {
        return actualUserName.equals(userName) && actualPassword.equals(password);
    }

    public String getActualPassword() {
        return actualPassword;
    }

    public void setActualPassword(String actualPassword) {
        this.actualPassword = actualPassword;
    }

    String actualUserName;String actualPassword;

    public Credentials(String actualUserName, String actualPassword) {
        this.actualUserName = actualUserName;
        this.actualPassword = actualPassword;
    }
}
