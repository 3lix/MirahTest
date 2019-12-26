package com.company.project.secondmodel;

public class Address {

    private long addressId;

    private Address(Builder builder) {
        this.addressId = builder.addressId;
    }

    public Address() {

    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private long addressId;

        private Builder() {
        }

        public Builder withAddressId(long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

}
