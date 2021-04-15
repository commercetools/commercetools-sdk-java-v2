
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerTokenBuilder {

    private String id;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    private String value;

    public CustomerTokenBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerTokenBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomerTokenBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomerTokenBuilder customerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public CustomerTokenBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public CustomerTokenBuilder value(final String value) {
        this.value = value;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public String getValue() {
        return this.value;
    }

    public CustomerToken build() {
        return new CustomerTokenImpl(id, createdAt, lastModifiedAt, customerId, expiresAt, value);
    }

    public static CustomerTokenBuilder of() {
        return new CustomerTokenBuilder();
    }

    public static CustomerTokenBuilder of(final CustomerToken template) {
        CustomerTokenBuilder builder = new CustomerTokenBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.customerId = template.getCustomerId();
        builder.expiresAt = template.getExpiresAt();
        builder.value = template.getValue();
        return builder;
    }

}
