
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
 * MyCustomerResetPassword
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerResetPasswordImpl implements MyCustomerResetPassword, ModelBase {

    private String tokenValue;

    private String newPassword;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue,
            @JsonProperty("newPassword") final String newPassword) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
    }

    /**
     * create empty instance
     */
    public MyCustomerResetPasswordImpl() {
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

    public void setTokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerResetPasswordImpl that = (MyCustomerResetPasswordImpl) o;

        return new EqualsBuilder().append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenValue).append(newPassword).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("tokenValue", tokenValue)
                .append("newPassword", newPassword)
                .build();
    }

    @Override
    public MyCustomerResetPassword copyDeep() {
        return MyCustomerResetPassword.deepCopy(this);
    }
}
