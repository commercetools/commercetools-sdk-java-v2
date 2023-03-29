
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Reset Customer's Password, Reset Customer's Password in a Store, Change Customer's Password, or Change Customer's Password in a Store request. This Message is also produced during equivalent requests to the My Customer Profile endpoint.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordUpdatedMessage customerPasswordUpdatedMessage = CustomerPasswordUpdatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .reset(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordUpdatedMessageImpl.class)
public interface CustomerPasswordUpdatedMessage extends Message {

    /**
     * discriminator value for CustomerPasswordUpdatedMessage
     */
    String CUSTOMER_PASSWORD_UPDATED = "CustomerPasswordUpdated";

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @return reset
     */
    @NotNull
    @JsonProperty("reset")
    public Boolean getReset();

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @param reset value to be set
     */

    public void setReset(final Boolean reset);

    /**
     * factory method
     * @return instance of CustomerPasswordUpdatedMessage
     */
    public static CustomerPasswordUpdatedMessage of() {
        return new CustomerPasswordUpdatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPasswordUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPasswordUpdatedMessage of(final CustomerPasswordUpdatedMessage template) {
        CustomerPasswordUpdatedMessageImpl instance = new CustomerPasswordUpdatedMessageImpl();
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
        instance.setReset(template.getReset());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerPasswordUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPasswordUpdatedMessage deepCopy(@Nullable final CustomerPasswordUpdatedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerPasswordUpdatedMessageImpl instance = new CustomerPasswordUpdatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setReset(template.getReset());
        return instance;
    }

    /**
     * builder factory method for CustomerPasswordUpdatedMessage
     * @return builder
     */
    public static CustomerPasswordUpdatedMessageBuilder builder() {
        return CustomerPasswordUpdatedMessageBuilder.of();
    }

    /**
     * create builder for CustomerPasswordUpdatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordUpdatedMessageBuilder builder(final CustomerPasswordUpdatedMessage template) {
        return CustomerPasswordUpdatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPasswordUpdatedMessage(Function<CustomerPasswordUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordUpdatedMessage>";
            }
        };
    }
}
