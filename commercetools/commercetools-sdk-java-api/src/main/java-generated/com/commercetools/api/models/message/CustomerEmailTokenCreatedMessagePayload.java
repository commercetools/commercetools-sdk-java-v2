
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
 *  <p>Generated after a successful Create email token for Customer or Create email token for Customer in Store request. The <code>resource</code> property of the Message is a CustomerEmailTokenReference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenCreatedMessagePayload customerEmailTokenCreatedMessagePayload = CustomerEmailTokenCreatedMessagePayload.builder()
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .invalidateOlderTokens(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerEmailTokenCreated")
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
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @return value
     */

    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @return invalidateOlderTokens
     */
    @NotNull
    @JsonProperty("invalidateOlderTokens")
    public Boolean getInvalidateOlderTokens();

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
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @param invalidateOlderTokens value to be set
     */

    public void setInvalidateOlderTokens(final Boolean invalidateOlderTokens);

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
        instance.setValue(template.getValue());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
        return instance;
    }

    public CustomerEmailTokenCreatedMessagePayload copyDeep();

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
        instance.setValue(template.getValue());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
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
