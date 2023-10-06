
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Create password reset token for Customer request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordTokenCreatedMessagePayloadImpl
        implements CustomerPasswordTokenCreatedMessagePayload, ModelBase {

    private String type;

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerPasswordTokenCreatedMessagePayloadImpl(@JsonProperty("customerId") final String customerId,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
        this.customerId = customerId;
        this.expiresAt = expiresAt;
        this.type = CUSTOMER_PASSWORD_TOKEN_CREATED;
    }

    /**
     * create empty instance
     */
    public CustomerPasswordTokenCreatedMessagePayloadImpl() {
        this.type = CUSTOMER_PASSWORD_TOKEN_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Date and time (UTC) the password token expires.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerPasswordTokenCreatedMessagePayloadImpl that = (CustomerPasswordTokenCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerId, that.customerId)
                .append(expiresAt, that.expiresAt)
                .append(type, that.type)
                .append(customerId, that.customerId)
                .append(expiresAt, that.expiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerId).append(expiresAt).toHashCode();
    }

}
