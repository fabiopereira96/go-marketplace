package br.com.go.marketplace.enums;

public enum UserStatus {
    NEW(0, "Account created but not activate."),
    ENABLED(1, "Account created and enabled."),
    DISABLED(2, "Account disabled."),
    INACTIVE(3, "Account stopped for more than a month");

    private final Integer value;
    private final String description;

    UserStatus(Integer value, String description) {
        this.value = value;
        this.description = description;
    }
}
