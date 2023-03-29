
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerResetPassword
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerResetPassword customerResetPassword = CustomerResetPassword.builder()
 *             .tokenValue("{tokenValue}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerResetPasswordImpl.class)
public interface CustomerResetPassword {

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     * @return tokenValue
     */
    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    /**
     *  <p>New password to be set.</p>
     * @return newPassword
     */
    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    /**
     *  <p>Expected version of the Customer.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     * @param tokenValue value to be set
     */

    public void setTokenValue(final String tokenValue);

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     */

    public void setNewPassword(final String newPassword);

    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of CustomerResetPassword
     */
    public static CustomerResetPassword of() {
        return new CustomerResetPasswordImpl();
    }

    /**
     * factory method to create a shallow copy CustomerResetPassword
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerResetPassword of(final CustomerResetPassword template) {
        CustomerResetPasswordImpl instance = new CustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerResetPassword
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerResetPassword deepCopy(@Nullable final CustomerResetPassword template) {
        if (template == null) {
            return null;
        }
        CustomerResetPasswordImpl instance = new CustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for CustomerResetPassword
     * @return builder
     */
    public static CustomerResetPasswordBuilder builder() {
        return CustomerResetPasswordBuilder.of();
    }

    /**
     * create builder for CustomerResetPassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerResetPasswordBuilder builder(final CustomerResetPassword template) {
        return CustomerResetPasswordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerResetPassword(Function<CustomerResetPassword, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerResetPassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerResetPassword>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerResetPassword>";
            }
        };
    }
}
