package com.company.project.firstmodel;

public class AuthContext {

    private String userId;

    private AuthContext(Builder builder) {
        this.userId = builder.userId;
    }

    public AuthContext() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String userId;

        private Builder() {
        }

        public AuthContext build() {
            return new AuthContext(this);
        }
    }

}
