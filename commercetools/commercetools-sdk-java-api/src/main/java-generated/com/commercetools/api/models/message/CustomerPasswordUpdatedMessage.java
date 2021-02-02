
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordUpdatedMessageImpl.class)
public interface CustomerPasswordUpdatedMessage extends Message {

    String CUSTOMER_PASSWORD_UPDATED = "CustomerPasswordUpdated";

    /**
    *  <p>true, if password has been updated during Customer's Password Reset workflow.</p>
    */
    @NotNull
    @JsonProperty("reset")
    public Boolean getReset();

    public void setReset(final Boolean reset);

    public static CustomerPasswordUpdatedMessage of() {
        return new CustomerPasswordUpdatedMessageImpl();
    }

    public static CustomerPasswordUpdatedMessage of(final CustomerPasswordUpdatedMessage template) {
        CustomerPasswordUpdatedMessageImpl instance = new CustomerPasswordUpdatedMessageImpl();
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
        instance.setReset(template.getReset());
        return instance;
    }

    public static CustomerPasswordUpdatedMessageBuilder builder() {
        return CustomerPasswordUpdatedMessageBuilder.of();
    }

    public static CustomerPasswordUpdatedMessageBuilder builder(final CustomerPasswordUpdatedMessage template) {
        return CustomerPasswordUpdatedMessageBuilder.of(template);
    }

    default <T> T withCustomerPasswordUpdatedMessage(Function<CustomerPasswordUpdatedMessage, T> helper) {
        return helper.apply(this);
    }
}
