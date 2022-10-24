
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();

    public void setTokenValue(final String tokenValue);

    public static MyCustomerEmailVerify of() {
        return new MyCustomerEmailVerifyImpl();
    }

    public static MyCustomerEmailVerify of(final MyCustomerEmailVerify template) {
        MyCustomerEmailVerifyImpl instance = new MyCustomerEmailVerifyImpl();
        instance.setTokenValue(template.getTokenValue());
        return instance;
    }

    public static MyCustomerEmailVerifyBuilder builder() {
        return MyCustomerEmailVerifyBuilder.of();
    }

    public static MyCustomerEmailVerifyBuilder builder(final MyCustomerEmailVerify template) {
        return MyCustomerEmailVerifyBuilder.of(template);
    }

    default <T> T withMyCustomerEmailVerify(Function<MyCustomerEmailVerify, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerEmailVerify> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerEmailVerify>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerEmailVerify>";
            }
        };
    }
}
