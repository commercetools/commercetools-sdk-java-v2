
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

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerCreatePasswordResetTokenImpl(@JsonProperty("email") final String email,
            @JsonProperty("ttlMinutes") final Long ttlMinutes) {
        this.email = email;
        this.ttlMinutes = ttlMinutes;
    }

    /**
     * create empty instance
     */
    public CustomerCreatePasswordResetTokenImpl() {
    }

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
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

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setTtlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
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
                .append(email, that.email)
                .append(ttlMinutes, that.ttlMinutes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(email).append(ttlMinutes).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("email", email)
                .append("ttlMinutes", ttlMinutes)
                .build();
    }

    @Override
    public CustomerCreatePasswordResetToken copyDeep() {
        return CustomerCreatePasswordResetToken.deepCopy(this);
    }
}
