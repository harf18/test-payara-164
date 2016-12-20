package fr.lescrous.test.model;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;


@JsonIgnoreProperties({"salt", "password"})
public class User {

    private Integer idUser;
    private String lastName;
    private String firstName;
    private String email;
    private String login;
    private String password;
    private String salt;
    private Boolean admin=false;
    private Boolean blocked=false;
    private Timestamp tsInsert;
    private Timestamp tsUpdate;
    private Timestamp tsConnection;
    private Timestamp tsPrevConnection;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }



    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }


    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }



    public Timestamp getTsInsert() {
        return tsInsert;
    }

    public void setTsInsert(Timestamp tsInsert) {
        this.tsInsert = tsInsert;
    }


    public Timestamp getTsUpdate() {
        return tsUpdate;
    }

    public void setTsUpdate(Timestamp tsUpdate) {
        this.tsUpdate = tsUpdate;
    }



    public Timestamp getTsConnection() {
        return tsConnection;
    }

    public void setTsConnection(Timestamp tsConnection) {
        this.tsConnection = tsConnection;
    }



    public Timestamp getTsPrevConnection() {
        return tsPrevConnection;
    }

    public void setTsPrevConnection(Timestamp tsPrevConnection) {
        this.tsPrevConnection = tsPrevConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (salt != null ? !salt.equals(user.salt) : user.salt != null) return false;
        if (admin != null ? !admin.equals(user.admin) : user.admin != null) return false;
        if (blocked != null ? !blocked.equals(user.blocked) : user.blocked != null) return false;
        if (tsInsert != null ? !tsInsert.equals(user.tsInsert) : user.tsInsert != null) return false;
        if (tsUpdate != null ? !tsUpdate.equals(user.tsUpdate) : user.tsUpdate != null) return false;
        if (tsConnection != null ? !tsConnection.equals(user.tsConnection) : user.tsConnection != null) return false;
        if (tsPrevConnection != null ? !tsPrevConnection.equals(user.tsPrevConnection) : user.tsPrevConnection != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (admin != null ? admin.hashCode() : 0);
        result = 31 * result + (blocked != null ? blocked.hashCode() : 0);
        result = 31 * result + (tsInsert != null ? tsInsert.hashCode() : 0);
        result = 31 * result + (tsUpdate != null ? tsUpdate.hashCode() : 0);
        result = 31 * result + (tsConnection != null ? tsConnection.hashCode() : 0);
        result = 31 * result + (tsPrevConnection != null ? tsPrevConnection.hashCode() : 0);
        return result;
    }

}
