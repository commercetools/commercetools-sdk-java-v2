
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerCreatedMessageImpl.class)
public interface CustomerCreatedMessage extends Message {

    String CUSTOMER_CREATED = "CustomerCreated";

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
