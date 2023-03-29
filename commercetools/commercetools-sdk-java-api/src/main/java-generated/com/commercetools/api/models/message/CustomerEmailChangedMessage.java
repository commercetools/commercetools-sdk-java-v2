
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
 *  <p>Generated after a successful Change Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailChangedMessage customerEmailChangedMessage = CustomerEmailChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailChangedMessageImpl.class)
public interface CustomerEmailChangedMessage extends Message {

    /**
     * discriminator value for CustomerEmailChangedMessage
     */
    String CUSTOMER_EMAIL_CHANGED = "CustomerEmailChanged";

    /**
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of CustomerEmailChangedMessage
     */
    public static CustomerEmailChangedMessage of() {
        return new CustomerEmailChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailChangedMessage of(final CustomerEmailChangedMessage template) {
        CustomerEmailChangedMessageImpl instance = new CustomerEmailChangedMessageImpl();
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
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerEmailChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailChangedMessage deepCopy(@Nullable final CustomerEmailChangedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerEmailChangedMessageImpl instance = new CustomerEmailChangedMessageImpl();
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
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailChangedMessage
     * @return builder
     */
    public static CustomerEmailChangedMessageBuilder builder() {
        return CustomerEmailChangedMessageBuilder.of();
    }

    /**
     * create builder for CustomerEmailChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailChangedMessageBuilder builder(final CustomerEmailChangedMessage template) {
        return CustomerEmailChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailChangedMessage(Function<CustomerEmailChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailChangedMessage>";
            }
        };
    }
}
