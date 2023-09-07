package agrigator;

import entity.User;

public class Client extends User {
    public String phone;

    public Client(int id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    public Client(int id, String name) {
        super(id, name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
