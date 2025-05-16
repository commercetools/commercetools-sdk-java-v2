
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
 * CustomerCreatePasswordResetToken
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreatePasswordResetToken customerCreatePasswordResetToken = CustomerCreatePasswordResetToken.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCreatePasswordResetTokenImpl.class)
public interface CustomerCreatePasswordResetToken {

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @return ttlMinutes
     */

    @JsonProperty("ttlMinutes")
    public Long getTtlMinutes();

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Validity period of the generated token in minutes.</p>
     * @param ttlMinutes value to be set
     */

    public void setTtlMinutes(final Long ttlMinutes);

    /**
     * factory method
     * @return instance of CustomerCreatePasswordResetToken
     */
    public static CustomerCreatePasswordResetToken of() {
        return new CustomerCreatePasswordResetTokenImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCreatePasswordResetToken
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCreatePasswordResetToken of(final CustomerCreatePasswordResetToken template) {
        CustomerCreatePasswordResetTokenImpl instance = new CustomerCreatePasswordResetTokenImpl();
        instance.setEmail(template.getEmail());
        instance.setTtlMinutes(template.getTtlMinutes());
        return instance;
    }

    public CustomerCreatePasswordResetToken copyDeep();

    /**
     * factory method to create a deep copy of CustomerCreatePasswordResetToken
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCreatePasswordResetToken deepCopy(@Nullable final CustomerCreatePasswordResetToken template) {
        if (template == null) {
            return null;
        }
        CustomerCreatePasswordResetTokenImpl instance = new CustomerCreatePasswordResetTokenImpl();
        instance.setEmail(template.getEmail());
        instance.setTtlMinutes(template.getTtlMinutes());
        return instance;
    }

    /**
     * builder factory method for CustomerCreatePasswordResetToken
     * @return builder
     */
    public static CustomerCreatePasswordResetTokenBuilder builder() {
        return CustomerCreatePasswordResetTokenBuilder.of();
    }

    /**
     * create builder for CustomerCreatePasswordResetToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreatePasswordResetTokenBuilder builder(final CustomerCreatePasswordResetToken template) {
        return CustomerCreatePasswordResetTokenBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCreatePasswordResetToken(Function<CustomerCreatePasswordResetToken, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatePasswordResetToken> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatePasswordResetToken>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatePasswordResetToken>";
            }
        };
    }
}
