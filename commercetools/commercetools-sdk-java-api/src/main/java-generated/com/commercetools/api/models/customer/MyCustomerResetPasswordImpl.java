
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
public class MyCustomerResetPasswordImpl implements MyCustomerResetPassword, ModelBase {

    private String tokenValue;

    private String newPassword;

    @JsonCreator
    MyCustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue,
            @JsonProperty("newPassword") final String newPassword) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
    }

    public MyCustomerResetPasswordImpl() {
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

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

        return new EqualsBuilder().append(tokenValue, that.tokenValue).append(newPassword, that.newPassword).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenValue).append(newPassword).toHashCode();
    }

}
