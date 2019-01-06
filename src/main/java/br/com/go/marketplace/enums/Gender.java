package br.com.go.marketplace.enums;

public enum Gender {
    FEMALE(0, "Female"),
    MALE(1, "Male"),
    OTHER(2, "Others");

    private final Integer value;
    private final String description;

    Gender(Integer value, String description) {
        this.value = value;
        this.description = description;
    }
}
