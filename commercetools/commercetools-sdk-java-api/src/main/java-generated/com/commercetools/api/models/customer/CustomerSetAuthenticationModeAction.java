
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerSetAuthenticationModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAuthenticationModeAction customerSetAuthenticationModeAction = CustomerSetAuthenticationModeAction.builder()
 *             .authMode(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAuthenticationMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetAuthenticationModeActionImpl.class)
public interface CustomerSetAuthenticationModeAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetAuthenticationModeAction
     */
    String SET_AUTHENTICATION_MODE = "setAuthenticationMode";

    /**
     *  <p>Value to set. Changing a Customer's <code>authMode</code> from <code>Password</code> to <code>ExternalAuth</code> deletes the Customer's password.</p>
     * @return authMode
     */
    @NotNull
    @JsonProperty("authMode")
    public AuthenticationMode getAuthMode();

    /**
     *  <p>Required when <code>authMode</code> is <code>Password</code>.</p>
     * @return password
     */

    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>Value to set. Changing a Customer's <code>authMode</code> from <code>Password</code> to <code>ExternalAuth</code> deletes the Customer's password.</p>
     * @param authMode value to be set
     */

    public void setAuthMode(final AuthenticationMode authMode);

    /**
     *  <p>Required when <code>authMode</code> is <code>Password</code>.</p>
     * @param password value to be set
     */

    public void setPassword(final String password);

    /**
     * factory method
     * @return instance of CustomerSetAuthenticationModeAction
     */
    public static CustomerSetAuthenticationModeAction of() {
        return new CustomerSetAuthenticationModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetAuthenticationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetAuthenticationModeAction of(final CustomerSetAuthenticationModeAction template) {
        CustomerSetAuthenticationModeActionImpl instance = new CustomerSetAuthenticationModeActionImpl();
        instance.setAuthMode(template.getAuthMode());
        instance.setPassword(template.getPassword());
        return instance;
    }

    public CustomerSetAuthenticationModeAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetAuthenticationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetAuthenticationModeAction deepCopy(
            @Nullable final CustomerSetAuthenticationModeAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetAuthenticationModeActionImpl instance = new CustomerSetAuthenticationModeActionImpl();
        instance.setAuthMode(template.getAuthMode());
        instance.setPassword(template.getPassword());
        return instance;
    }

    /**
     * builder factory method for CustomerSetAuthenticationModeAction
     * @return builder
     */
    public static CustomerSetAuthenticationModeActionBuilder builder() {
        return CustomerSetAuthenticationModeActionBuilder.of();
    }

    /**
     * create builder for CustomerSetAuthenticationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetAuthenticationModeActionBuilder builder(
            final CustomerSetAuthenticationModeAction template) {
        return CustomerSetAuthenticationModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetAuthenticationModeAction(Function<CustomerSetAuthenticationModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAuthenticationModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAuthenticationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAuthenticationModeAction>";
            }
        };
    }
}
