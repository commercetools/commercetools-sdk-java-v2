
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
 * CustomerCreatePasswordResetToken
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCreatePasswordResetTokenImpl implements CustomerCreatePasswordResetToken, ModelBase {

    private String email;

    private Long ttlMinutes;

    private Boolean invalidateOlderTokens;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerCreatePasswordResetTokenImpl(@JsonProperty("email") final String email,
            @JsonProperty("ttlMinutes") final Long ttlMinutes,
            @JsonProperty("invalidateOlderTokens") final Boolean invalidateOlderTokens) {
        this.email = email;
        this.ttlMinutes = ttlMinutes;
        this.invalidateOlderTokens = invalidateOlderTokens;
    }

    /**
     * create empty instance
     */
    public CustomerCreatePasswordResetTokenImpl() {
    }

    /**
     *  <p>Email address of the Customer treated as <span>case-insensitive</span>.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     */

    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    /**
     *  <p>If set to <code>true</code>, all password tokens issued previously for the Customer will be invalidated.</p>
     */

    public Boolean getInvalidateOlderTokens() {
        return this.invalidateOlderTokens;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setTtlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
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

        CustomerCreatePasswordResetTokenImpl that = (CustomerCreatePasswordResetTokenImpl) o;

        return new EqualsBuilder().append(email, that.email)
                .append(ttlMinutes, that.ttlMinutes)
                .append(invalidateOlderTokens, that.invalidateOlderTokens)
                .append(email, that.email)
                .append(ttlMinutes, that.ttlMinutes)
                .append(invalidateOlderTokens, that.invalidateOlderTokens)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(email).append(ttlMinutes).append(invalidateOlderTokens).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("email", email)
                .append("ttlMinutes", ttlMinutes)
                .append("invalidateOlderTokens", invalidateOlderTokens)
                .build();
    }

    @Override
    public CustomerCreatePasswordResetToken copyDeep() {
        return CustomerCreatePasswordResetToken.deepCopy(this);
    }
}
