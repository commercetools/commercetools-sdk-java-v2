
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CustomerToken
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerTokenImpl implements CustomerToken, ModelBase {

    private String id;

    private String customerId;

    private String value;

    private java.time.ZonedDateTime expiresAt;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerTokenImpl(@JsonProperty("id") final String id, @JsonProperty("customerId") final String customerId,
            @JsonProperty("value") final String value,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.id = id;
        this.customerId = customerId;
        this.value = value;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * create empty instance
     */
    public CustomerTokenImpl() {
    }

    /**
     *  <p>Unique identifier of the token.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>id</code> of the Customer.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Value of the token.</p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>Date and time (UTC) the token expires.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Date and time (UTC) the token was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>When the token is created, <code>lastModifiedAt</code> is set to <code>createdAt</code>.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerTokenImpl that = (CustomerTokenImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(customerId, that.customerId)
                .append(value, that.value)
                .append(expiresAt, that.expiresAt)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(id, that.id)
                .append(customerId, that.customerId)
                .append(value, that.value)
                .append(expiresAt, that.expiresAt)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(customerId)
                .append(value)
                .append(expiresAt)
                .append(createdAt)
                .append(lastModifiedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("customerId", customerId)
                .append("value", value)
                .append("expiresAt", expiresAt)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .build();
    }

    @Override
    public CustomerToken copyDeep() {
        return CustomerToken.deepCopy(this);
    }
}
