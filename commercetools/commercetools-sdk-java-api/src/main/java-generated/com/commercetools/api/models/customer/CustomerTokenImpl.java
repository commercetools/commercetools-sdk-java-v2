
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerTokenImpl implements CustomerToken, ModelBase {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    private String value;

    @JsonCreator
    CustomerTokenImpl(@JsonProperty("id") final String id,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("value") final String value) {
        this.id = id;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.customerId = customerId;
        this.expiresAt = expiresAt;
        this.value = value;
    }

    public CustomerTokenImpl() {
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

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

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerTokenImpl that = (CustomerTokenImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(customerId, that.customerId)
                .append(expiresAt, that.expiresAt)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(customerId)
                .append(expiresAt)
                .append(value)
                .toHashCode();
    }

}
