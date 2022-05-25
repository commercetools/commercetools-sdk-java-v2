
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCreatedMessage
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

    String CUSTOMER_CREATED = "CustomerCreated";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    public void setCustomer(final Customer customer);

    public static CustomerCreatedMessage of() {
        return new CustomerCreatedMessageImpl();
    }

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

    public static CustomerCreatedMessageBuilder builder() {
        return CustomerCreatedMessageBuilder.of();
    }

    public static CustomerCreatedMessageBuilder builder(final CustomerCreatedMessage template) {
        return CustomerCreatedMessageBuilder.of(template);
    }

    default <T> T withCustomerCreatedMessage(Function<CustomerCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatedMessage>";
            }
        };
    }
}
