
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
 * MyCustomerResetPassword
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerResetPassword myCustomerResetPassword = MyCustomerResetPassword.builder()
 *             .tokenValue("{tokenValue}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerResetPasswordImpl.class)
public interface MyCustomerResetPassword {

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
     * factory method
     * @return instance of MyCustomerResetPassword
     */
    public static MyCustomerResetPassword of() {
        return new MyCustomerResetPasswordImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerResetPassword
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerResetPassword of(final MyCustomerResetPassword template) {
        MyCustomerResetPasswordImpl instance = new MyCustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public MyCustomerResetPassword copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerResetPassword
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerResetPassword deepCopy(@Nullable final MyCustomerResetPassword template) {
        if (template == null) {
            return null;
        }
        MyCustomerResetPasswordImpl instance = new MyCustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    /**
     * builder factory method for MyCustomerResetPassword
     * @return builder
     */
    public static MyCustomerResetPasswordBuilder builder() {
        return MyCustomerResetPasswordBuilder.of();
    }

    /**
     * create builder for MyCustomerResetPassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerResetPasswordBuilder builder(final MyCustomerResetPassword template) {
        return MyCustomerResetPasswordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerResetPassword(Function<MyCustomerResetPassword, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerResetPassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerResetPassword>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerResetPassword>";
            }
        };
    }
}
