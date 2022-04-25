
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerEmailChangedMessageImpl.class)
public interface CustomerEmailChangedMessage extends Message {

    String CUSTOMER_EMAIL_CHANGED = "CustomerEmailChanged";

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CustomerEmailChangedMessage of() {
        return new CustomerEmailChangedMessageImpl();
    }

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

    public static CustomerEmailChangedMessageBuilder builder() {
        return CustomerEmailChangedMessageBuilder.of();
    }

    public static CustomerEmailChangedMessageBuilder builder(final CustomerEmailChangedMessage template) {
        return CustomerEmailChangedMessageBuilder.of(template);
    }

    default <T> T withCustomerEmailChangedMessage(Function<CustomerEmailChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailChangedMessage>";
            }
        };
    }
}
