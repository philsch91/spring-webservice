package at.fhcampuswien.sde.carrentalwebservice.model.dto;

public class UserInfo {

    private String email;
    private String defaultCurrency;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(String currency) {
        this.defaultCurrency = currency;
    }
}
