
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerDeletedMessageImpl.class)
public interface CustomerDeletedMessage extends Message {

    String CUSTOMER_DELETED = "CustomerDeleted";

    public static CustomerDeletedMessage of() {
        return new CustomerDeletedMessageImpl();
    }

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

    public static CustomerDeletedMessageBuilder builder() {
        return CustomerDeletedMessageBuilder.of();
    }

    public static CustomerDeletedMessageBuilder builder(final CustomerDeletedMessage template) {
        return CustomerDeletedMessageBuilder.of(template);
    }

    default <T> T withCustomerDeletedMessage(Function<CustomerDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDeletedMessage>";
            }
        };
    }
}
