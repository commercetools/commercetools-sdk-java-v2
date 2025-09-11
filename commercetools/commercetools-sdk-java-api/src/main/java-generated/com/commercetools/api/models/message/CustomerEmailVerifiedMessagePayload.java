
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/email/confirm:POST" rel="nofollow">Verify Customer's Email</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerifiedMessagePayload customerEmailVerifiedMessagePayload = CustomerEmailVerifiedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerEmailVerified")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailVerifiedMessagePayloadImpl.class)
public interface CustomerEmailVerifiedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerEmailVerifiedMessagePayload
     */
    String CUSTOMER_EMAIL_VERIFIED = "CustomerEmailVerified";

    /**
     * factory method
     * @return instance of CustomerEmailVerifiedMessagePayload
     */
    public static CustomerEmailVerifiedMessagePayload of() {
        return new CustomerEmailVerifiedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailVerifiedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailVerifiedMessagePayload of(final CustomerEmailVerifiedMessagePayload template) {
        CustomerEmailVerifiedMessagePayloadImpl instance = new CustomerEmailVerifiedMessagePayloadImpl();
        return instance;
    }

    public CustomerEmailVerifiedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerEmailVerifiedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailVerifiedMessagePayload deepCopy(
            @Nullable final CustomerEmailVerifiedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerEmailVerifiedMessagePayloadImpl instance = new CustomerEmailVerifiedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CustomerEmailVerifiedMessagePayload
     * @return builder
     */
    public static CustomerEmailVerifiedMessagePayloadBuilder builder() {
        return CustomerEmailVerifiedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerEmailVerifiedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailVerifiedMessagePayloadBuilder builder(
            final CustomerEmailVerifiedMessagePayload template) {
        return CustomerEmailVerifiedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailVerifiedMessagePayload(Function<CustomerEmailVerifiedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailVerifiedMessagePayload>";
            }
        };
    }
}
