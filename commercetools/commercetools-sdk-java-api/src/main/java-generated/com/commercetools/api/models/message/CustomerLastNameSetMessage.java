
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Last Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLastNameSetMessage customerLastNameSetMessage = CustomerLastNameSetMessage.builder()
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
@JsonDeserialize(as = CustomerLastNameSetMessageImpl.class)
public interface CustomerLastNameSetMessage extends Message {

    /**
     * discriminator value for CustomerLastNameSetMessage
     */
    String CUSTOMER_LAST_NAME_SET = "CustomerLastNameSet";

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     * factory method
     * @return instance of CustomerLastNameSetMessage
     */
    public static CustomerLastNameSetMessage of() {
        return new CustomerLastNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerLastNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerLastNameSetMessage of(final CustomerLastNameSetMessage template) {
        CustomerLastNameSetMessageImpl instance = new CustomerLastNameSetMessageImpl();
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
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerLastNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerLastNameSetMessage deepCopy(@Nullable final CustomerLastNameSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerLastNameSetMessageImpl instance = new CustomerLastNameSetMessageImpl();
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
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * builder factory method for CustomerLastNameSetMessage
     * @return builder
     */
    public static CustomerLastNameSetMessageBuilder builder() {
        return CustomerLastNameSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerLastNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLastNameSetMessageBuilder builder(final CustomerLastNameSetMessage template) {
        return CustomerLastNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerLastNameSetMessage(Function<CustomerLastNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLastNameSetMessage>";
            }
        };
    }
}
