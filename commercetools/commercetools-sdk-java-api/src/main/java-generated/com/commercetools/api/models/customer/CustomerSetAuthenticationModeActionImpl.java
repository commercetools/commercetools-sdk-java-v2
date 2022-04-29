
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
public class CustomerSetAuthenticationModeActionImpl implements CustomerSetAuthenticationModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer.AuthenticationMode authMode;

    private String password;

    @JsonCreator
    CustomerSetAuthenticationModeActionImpl(
            @JsonProperty("authMode") final com.commercetools.api.models.customer.AuthenticationMode authMode,
            @JsonProperty("password") final String password) {
        this.authMode = authMode;
        this.password = password;
        this.action = SET_AUTHENTICATION_MODE;
    }

    public CustomerSetAuthenticationModeActionImpl() {
        this.action = SET_AUTHENTICATION_MODE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.customer.AuthenticationMode getAuthMode() {
        return this.authMode;
    }

    /**
    *  <p>Required when <code>authMode</code> is <code>Password</code></p>
    */
    public String getPassword() {
        return this.password;
    }

    public void setAuthMode(final com.commercetools.api.models.customer.AuthenticationMode authMode) {
        this.authMode = authMode;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetAuthenticationModeActionImpl that = (CustomerSetAuthenticationModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(authMode, that.authMode)
                .append(password, that.password)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(authMode).append(password).toHashCode();
    }

}
