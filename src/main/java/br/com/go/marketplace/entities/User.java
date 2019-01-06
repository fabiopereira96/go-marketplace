package br.com.go.marketplace.entities;

import br.com.go.marketplace.enums.Gender;
import br.com.go.marketplace.enums.UserStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUser;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "cpf", unique = true)
    @CPF
    private String cpf;

    @Column(name = "rg", unique = true)
    private String rg;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private UserStatus status;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "encryptKey")
    private String encryptKey;

    @Column(name = "gender")
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Column(name = "address")
    private String address;

    @Column(name = "zipCode")
    private Integer zipCode;

    @Column(name = "compl")
    private String compl;

    public User() {}
    public User(@Email String email, @CPF String cpf, String rg, UserStatus status, String password, String encryptKey, Gender gender, String address, Integer zipCode, String compl) {
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.status = status;
        this.password = password;
        this.encryptKey = encryptKey;
        this.gender = gender;
        this.address = address;
        this.zipCode = zipCode;
        this.compl = compl;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser.equals(user.idUser) &&
                email.equals(user.email) &&
                Objects.equals(cpf, user.cpf) &&
                Objects.equals(rg, user.rg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser);
    }
}
