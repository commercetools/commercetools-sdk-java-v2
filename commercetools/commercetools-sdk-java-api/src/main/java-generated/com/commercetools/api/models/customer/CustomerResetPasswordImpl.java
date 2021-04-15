
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerResetPasswordImpl implements CustomerResetPassword {

    private String tokenValue;

    private String newPassword;

    private Long version;

    @JsonCreator
    CustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue,
            @JsonProperty("newPassword") final String newPassword, @JsonProperty("version") final Long version) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
        this.version = version;
    }

    public CustomerResetPasswordImpl() {
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenValue).append(newPassword).append(version).toHashCode();
    }

}
