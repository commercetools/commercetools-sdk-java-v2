
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create password reset token for Customer request. The <code>resource</code> property of the Message is a CustomerPasswordTokenReference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordTokenCreatedMessagePayload customerPasswordTokenCreatedMessagePayload = CustomerPasswordTokenCreatedMessagePayload.builder()
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerPasswordTokenCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordTokenCreatedMessagePayloadImpl.class)
public interface CustomerPasswordTokenCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerPasswordTokenCreatedMessagePayload
     */
    String CUSTOMER_PASSWORD_TOKEN_CREATED = "CustomerPasswordTokenCreated";

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return customerId
     */
    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Date and time (UTC) the password token expires.</p>
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
     *  <p>Date and time (UTC) the password token expires.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     * factory method
     * @return instance of CustomerPasswordTokenCreatedMessagePayload
     */
    public static CustomerPasswordTokenCreatedMessagePayload of() {
        return new CustomerPasswordTokenCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPasswordTokenCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPasswordTokenCreatedMessagePayload of(
            final CustomerPasswordTokenCreatedMessagePayload template) {
        CustomerPasswordTokenCreatedMessagePayloadImpl instance = new CustomerPasswordTokenCreatedMessagePayloadImpl();
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    public CustomerPasswordTokenCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerPasswordTokenCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPasswordTokenCreatedMessagePayload deepCopy(
            @Nullable final CustomerPasswordTokenCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerPasswordTokenCreatedMessagePayloadImpl instance = new CustomerPasswordTokenCreatedMessagePayloadImpl();
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * builder factory method for CustomerPasswordTokenCreatedMessagePayload
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessagePayloadBuilder builder() {
        return CustomerPasswordTokenCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerPasswordTokenCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessagePayloadBuilder builder(
            final CustomerPasswordTokenCreatedMessagePayload template) {
        return CustomerPasswordTokenCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPasswordTokenCreatedMessagePayload(
            Function<CustomerPasswordTokenCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordTokenCreatedMessagePayload>";
            }
        };
    }
}
