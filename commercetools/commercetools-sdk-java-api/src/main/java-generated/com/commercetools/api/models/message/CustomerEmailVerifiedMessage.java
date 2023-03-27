
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Verify Customer's Email request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerifiedMessage customerEmailVerifiedMessage = CustomerEmailVerifiedMessage.builder()
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
@JsonDeserialize(as = CustomerEmailVerifiedMessageImpl.class)
public interface CustomerEmailVerifiedMessage extends Message {

    /**
     * discriminator value for CustomerEmailVerifiedMessage
     */
    String CUSTOMER_EMAIL_VERIFIED = "CustomerEmailVerified";

    /**
     * factory method
     * @return instance of CustomerEmailVerifiedMessage
     */
    public static CustomerEmailVerifiedMessage of() {
        return new CustomerEmailVerifiedMessageImpl();
    }

    /**
     * factory method to copy an instance of CustomerEmailVerifiedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailVerifiedMessage of(final CustomerEmailVerifiedMessage template) {
        CustomerEmailVerifiedMessageImpl instance = new CustomerEmailVerifiedMessageImpl();
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
     * builder factory method for CustomerEmailVerifiedMessage
     * @return builder
     */
    public static CustomerEmailVerifiedMessageBuilder builder() {
        return CustomerEmailVerifiedMessageBuilder.of();
    }

    /**
     * create builder for CustomerEmailVerifiedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailVerifiedMessageBuilder builder(final CustomerEmailVerifiedMessage template) {
        return CustomerEmailVerifiedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailVerifiedMessage(Function<CustomerEmailVerifiedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailVerifiedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailVerifiedMessage>";
            }
        };
    }
}
