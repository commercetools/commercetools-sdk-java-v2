
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Customer request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDeletedMessage customerDeletedMessage = CustomerDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDeletedMessageImpl.class)
public interface CustomerDeletedMessage extends Message {

    /**
     * discriminator value for CustomerDeletedMessage
     */
    String CUSTOMER_DELETED = "CustomerDeleted";

    /**
     * factory method
     * @return instance of CustomerDeletedMessage
     */
    public static CustomerDeletedMessage of() {
        return new CustomerDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDeletedMessage of(final CustomerDeletedMessage template) {
        CustomerDeletedMessageImpl instance = new CustomerDeletedMessageImpl();
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
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDeletedMessage deepCopy(@Nullable final CustomerDeletedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerDeletedMessageImpl instance = new CustomerDeletedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for CustomerDeletedMessage
     * @return builder
     */
    public static CustomerDeletedMessageBuilder builder() {
        return CustomerDeletedMessageBuilder.of();
    }

    /**
     * create builder for CustomerDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDeletedMessageBuilder builder(final CustomerDeletedMessage template) {
        return CustomerDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDeletedMessage(Function<CustomerDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDeletedMessage>";
            }
        };
    }
}
