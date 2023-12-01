
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
 *  <p>Generated after a successful Create password reset token for Customer request. The <code>resource</code> property of the Message is a CustomerPasswordTokenReference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordTokenCreatedMessage customerPasswordTokenCreatedMessage = CustomerPasswordTokenCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordTokenCreatedMessageImpl.class)
public interface CustomerPasswordTokenCreatedMessage extends Message {

    /**
     * discriminator value for CustomerPasswordTokenCreatedMessage
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
     * @return instance of CustomerPasswordTokenCreatedMessage
     */
    public static CustomerPasswordTokenCreatedMessage of() {
        return new CustomerPasswordTokenCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPasswordTokenCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPasswordTokenCreatedMessage of(final CustomerPasswordTokenCreatedMessage template) {
        CustomerPasswordTokenCreatedMessageImpl instance = new CustomerPasswordTokenCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerPasswordTokenCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPasswordTokenCreatedMessage deepCopy(
            @Nullable final CustomerPasswordTokenCreatedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerPasswordTokenCreatedMessageImpl instance = new CustomerPasswordTokenCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * builder factory method for CustomerPasswordTokenCreatedMessage
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessageBuilder builder() {
        return CustomerPasswordTokenCreatedMessageBuilder.of();
    }

    /**
     * create builder for CustomerPasswordTokenCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessageBuilder builder(
            final CustomerPasswordTokenCreatedMessage template) {
        return CustomerPasswordTokenCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPasswordTokenCreatedMessage(Function<CustomerPasswordTokenCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordTokenCreatedMessage>";
            }
        };
    }
}
