
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
 * CustomerEmailVerify
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailVerifyImpl implements CustomerEmailVerify, ModelBase {

    private Long version;

    private String tokenValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerEmailVerifyImpl(@JsonProperty("version") final Long version,
            @JsonProperty("tokenValue") final String tokenValue) {
        this.version = version;
        this.tokenValue = tokenValue;
    }

    /**
     * create empty instance
     */
    public CustomerEmailVerifyImpl() {
    }

    /**
     *  <p>Expected version of the Customer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Value of the token to verify Customer email.</p>
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setTokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerEmailVerifyImpl that = (CustomerEmailVerifyImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(tokenValue, that.tokenValue)
                .append(version, that.version)
                .append(tokenValue, that.tokenValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(tokenValue).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("tokenValue", tokenValue)
                .build();
    }

}
