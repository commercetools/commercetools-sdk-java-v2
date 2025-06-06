
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
 * CustomerResetPassword
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerResetPasswordImpl implements CustomerResetPassword, ModelBase {

    private String tokenValue;

    private String newPassword;

    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue,
            @JsonProperty("newPassword") final String newPassword, @JsonProperty("version") final Long version) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public CustomerResetPasswordImpl() {
    }

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     *  <p>New password to be set.</p>
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     *  <p>Expected version of the Customer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    public void setTokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerResetPasswordImpl that = (CustomerResetPasswordImpl) o;

        return new EqualsBuilder().append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .append(version, that.version)
                .append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenValue).append(newPassword).append(version).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("tokenValue", tokenValue)
                .append("newPassword", newPassword)
                .append("version", version)
                .build();
    }

    @Override
    public CustomerResetPassword copyDeep() {
        return CustomerResetPassword.deepCopy(this);
    }
}
