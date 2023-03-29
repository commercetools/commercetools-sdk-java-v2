
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
 * MyCustomerEmailVerify
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerEmailVerify myCustomerEmailVerify = MyCustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerEmailVerifyImpl.class)
public interface MyCustomerEmailVerify {

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @return tokenValue
     */
    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @param tokenValue value to be set
     */

    public void setTokenValue(final String tokenValue);

    /**
     * factory method
     * @return instance of MyCustomerEmailVerify
     */
    public static MyCustomerEmailVerify of() {
        return new MyCustomerEmailVerifyImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerEmailVerify
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerEmailVerify of(final MyCustomerEmailVerify template) {
        MyCustomerEmailVerifyImpl instance = new MyCustomerEmailVerifyImpl();
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerEmailVerify
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerEmailVerify deepCopy(@Nullable final MyCustomerEmailVerify template) {
        if (template == null) {
            return null;
        }
        MyCustomerEmailVerifyImpl instance = new MyCustomerEmailVerifyImpl();
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    /**
     * builder factory method for MyCustomerEmailVerify
     * @return builder
     */
    public static MyCustomerEmailVerifyBuilder builder() {
        return MyCustomerEmailVerifyBuilder.of();
    }

    /**
     * create builder for MyCustomerEmailVerify instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerEmailVerifyBuilder builder(final MyCustomerEmailVerify template) {
        return MyCustomerEmailVerifyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerEmailVerify(Function<MyCustomerEmailVerify, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerEmailVerify> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerEmailVerify>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerEmailVerify>";
            }
        };
    }
}
