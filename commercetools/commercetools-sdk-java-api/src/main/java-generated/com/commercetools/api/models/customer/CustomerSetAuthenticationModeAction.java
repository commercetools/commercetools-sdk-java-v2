
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetAuthenticationModeActionImpl.class)
public interface CustomerSetAuthenticationModeAction extends CustomerUpdateAction {

    String SET_AUTHENTICATION_MODE = "setAuthenticationMode";

    @NotNull
    @JsonProperty("authMode")
    public AuthenticationMode getAuthMode();

    /**
    *  <p>Required when <code>authMode</code> is <code>Password</code></p>
    */

    @JsonProperty("password")
    public String getPassword();

    public void setAuthMode(final AuthenticationMode authMode);

    public void setPassword(final String password);

    public static CustomerSetAuthenticationModeAction of() {
        return new CustomerSetAuthenticationModeActionImpl();
    }

    public static CustomerSetAuthenticationModeAction of(final CustomerSetAuthenticationModeAction template) {
        CustomerSetAuthenticationModeActionImpl instance = new CustomerSetAuthenticationModeActionImpl();
        instance.setAuthMode(template.getAuthMode());
        instance.setPassword(template.getPassword());
        return instance;
    }

    public static CustomerSetAuthenticationModeActionBuilder builder() {
        return CustomerSetAuthenticationModeActionBuilder.of();
    }

    public static CustomerSetAuthenticationModeActionBuilder builder(
            final CustomerSetAuthenticationModeAction template) {
        return CustomerSetAuthenticationModeActionBuilder.of(template);
    }

    default <T> T withCustomerSetAuthenticationModeAction(Function<CustomerSetAuthenticationModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAuthenticationModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAuthenticationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAuthenticationModeAction>";
            }
        };
    }
}
