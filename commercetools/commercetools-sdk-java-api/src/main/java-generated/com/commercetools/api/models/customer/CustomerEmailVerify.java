
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
 * CustomerEmailVerify
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerify customerEmailVerify = CustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifyImpl.class)
public interface CustomerEmailVerify {

    /**
     *  <p>Expected version of the Customer.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @return tokenValue
     */
    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @param tokenValue value to be set
     */

    public void setTokenValue(final String tokenValue);

    /**
     * factory method
     * @return instance of CustomerEmailVerify
     */
    public static CustomerEmailVerify of() {
        return new CustomerEmailVerifyImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailVerify
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailVerify of(final CustomerEmailVerify template) {
        CustomerEmailVerifyImpl instance = new CustomerEmailVerifyImpl();
        instance.setVersion(template.getVersion());
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerEmailVerify
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailVerify deepCopy(@Nullable final CustomerEmailVerify template) {
        if (template == null) {
            return null;
        }
        CustomerEmailVerifyImpl instance = new CustomerEmailVerifyImpl();
        instance.setVersion(template.getVersion());
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailVerify
     * @return builder
     */
    public static CustomerEmailVerifyBuilder builder() {
        return CustomerEmailVerifyBuilder.of();
    }

    /**
     * create builder for CustomerEmailVerify instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailVerifyBuilder builder(final CustomerEmailVerify template) {
        return CustomerEmailVerifyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailVerify(Function<CustomerEmailVerify, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerify> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerify>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailVerify>";
            }
        };
    }
}
