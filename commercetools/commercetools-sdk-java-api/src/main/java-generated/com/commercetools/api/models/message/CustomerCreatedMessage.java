
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Customer request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCreatedMessage customerCreatedMessage = CustomerCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCreatedMessageImpl.class)
public interface CustomerCreatedMessage extends Message {

    /**
     * discriminator value for CustomerCreatedMessage
     */
    String CUSTOMER_CREATED = "CustomerCreated";

    /**
     *  <p>Customer that was created.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    /**
     *  <p>Customer that was created.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Customer customer);

    /**
     * factory method
     * @return instance of CustomerCreatedMessage
     */
    public static CustomerCreatedMessage of() {
        return new CustomerCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCreatedMessage of(final CustomerCreatedMessage template) {
        CustomerCreatedMessageImpl instance = new CustomerCreatedMessageImpl();
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
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCreatedMessage deepCopy(@Nullable final CustomerCreatedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerCreatedMessageImpl instance = new CustomerCreatedMessageImpl();
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
        instance.setCustomer(Optional.ofNullable(template.getCustomer())
                .map(com.commercetools.api.models.customer.Customer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerCreatedMessage
     * @return builder
     */
    public static CustomerCreatedMessageBuilder builder() {
        return CustomerCreatedMessageBuilder.of();
    }

    /**
     * create builder for CustomerCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCreatedMessageBuilder builder(final CustomerCreatedMessage template) {
        return CustomerCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCreatedMessage(Function<CustomerCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatedMessage>";
            }
        };
    }
}
