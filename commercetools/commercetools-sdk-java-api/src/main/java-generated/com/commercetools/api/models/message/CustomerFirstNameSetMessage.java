
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set First Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerFirstNameSetMessage customerFirstNameSetMessage = CustomerFirstNameSetMessage.builder()
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
@JsonDeserialize(as = CustomerFirstNameSetMessageImpl.class)
public interface CustomerFirstNameSetMessage extends Message {

    /**
     * discriminator value for CustomerFirstNameSetMessage
     */
    String CUSTOMER_FIRST_NAME_SET = "CustomerFirstNameSet";

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     * factory method
     * @return instance of CustomerFirstNameSetMessage
     */
    public static CustomerFirstNameSetMessage of() {
        return new CustomerFirstNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerFirstNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerFirstNameSetMessage of(final CustomerFirstNameSetMessage template) {
        CustomerFirstNameSetMessageImpl instance = new CustomerFirstNameSetMessageImpl();
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
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerFirstNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerFirstNameSetMessage deepCopy(@Nullable final CustomerFirstNameSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerFirstNameSetMessageImpl instance = new CustomerFirstNameSetMessageImpl();
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
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * builder factory method for CustomerFirstNameSetMessage
     * @return builder
     */
    public static CustomerFirstNameSetMessageBuilder builder() {
        return CustomerFirstNameSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerFirstNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerFirstNameSetMessageBuilder builder(final CustomerFirstNameSetMessage template) {
        return CustomerFirstNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerFirstNameSetMessage(Function<CustomerFirstNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerFirstNameSetMessage>";
            }
        };
    }
}
