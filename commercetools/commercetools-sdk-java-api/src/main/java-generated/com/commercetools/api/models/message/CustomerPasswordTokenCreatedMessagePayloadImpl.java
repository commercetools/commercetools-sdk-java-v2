
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Create password reset token for Customer or Create password reset token for Customer in Store request. The <code>resource</code> property of the Message is a CustomerPasswordTokenReference.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordTokenCreatedMessagePayloadImpl
        implements CustomerPasswordTokenCreatedMessagePayload, ModelBase {

    private String type;

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    private String value;

    private Boolean invalidateOlderTokens;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerPasswordTokenCreatedMessagePayloadImpl(@JsonProperty("customerId") final String customerId,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("value") final String value,
            @JsonProperty("invalidateOlderTokens") final Boolean invalidateOlderTokens) {
        this.customerId = customerId;
        this.expiresAt = expiresAt;
        this.value = value;
        this.invalidateOlderTokens = invalidateOlderTokens;
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

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, all password tokens issued previously for the Customer are invalidated.</p>
     */

    public Boolean getInvalidateOlderTokens() {
        return this.invalidateOlderTokens;
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

    public void setInvalidateOlderTokens(final Boolean invalidateOlderTokens) {
        this.invalidateOlderTokens = invalidateOlderTokens;
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
                .append(value, that.value)
                .append(invalidateOlderTokens, that.invalidateOlderTokens)
                .append(type, that.type)
                .append(customerId, that.customerId)
                .append(expiresAt, that.expiresAt)
                .append(value, that.value)
                .append(invalidateOlderTokens, that.invalidateOlderTokens)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customerId)
                .append(expiresAt)
                .append(value)
                .append(invalidateOlderTokens)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerId", customerId)
                .append("expiresAt", expiresAt)
                .append("value", value)
                .append("invalidateOlderTokens", invalidateOlderTokens)
                .build();
    }

    @Override
    public CustomerPasswordTokenCreatedMessagePayload copyDeep() {
        return CustomerPasswordTokenCreatedMessagePayload.deepCopy(this);
    }
}
