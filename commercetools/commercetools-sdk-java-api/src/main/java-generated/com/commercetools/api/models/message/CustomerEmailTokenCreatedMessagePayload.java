
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create email token for Customer request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenCreatedMessagePayload customerEmailTokenCreatedMessagePayload = CustomerEmailTokenCreatedMessagePayload.builder()
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailTokenCreatedMessagePayloadImpl.class)
public interface CustomerEmailTokenCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerEmailTokenCreatedMessagePayload
     */
    String CUSTOMER_EMAIL_TOKEN_CREATED = "CustomerEmailTokenCreated";

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return customerId
     */
    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     * factory method
     * @return instance of CustomerEmailTokenCreatedMessagePayload
     */
    public static CustomerEmailTokenCreatedMessagePayload of() {
        return new CustomerEmailTokenCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailTokenCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailTokenCreatedMessagePayload of(final CustomerEmailTokenCreatedMessagePayload template) {
        CustomerEmailTokenCreatedMessagePayloadImpl instance = new CustomerEmailTokenCreatedMessagePayloadImpl();
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerEmailTokenCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailTokenCreatedMessagePayload deepCopy(
            @Nullable final CustomerEmailTokenCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerEmailTokenCreatedMessagePayloadImpl instance = new CustomerEmailTokenCreatedMessagePayloadImpl();
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailTokenCreatedMessagePayload
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessagePayloadBuilder builder() {
        return CustomerEmailTokenCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerEmailTokenCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessagePayloadBuilder builder(
            final CustomerEmailTokenCreatedMessagePayload template) {
        return CustomerEmailTokenCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailTokenCreatedMessagePayload(
            Function<CustomerEmailTokenCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailTokenCreatedMessagePayload>";
            }
        };
    }
}
