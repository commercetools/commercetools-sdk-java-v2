
package com.commercetools.api.models.message;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerDateOfBirthSetMessageImpl.class)
public interface CustomerDateOfBirthSetMessage extends Message {

    String CUSTOMER_DATE_OF_BIRTH_SET = "CustomerDateOfBirthSet";

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static CustomerDateOfBirthSetMessage of() {
        return new CustomerDateOfBirthSetMessageImpl();
    }

    public static CustomerDateOfBirthSetMessage of(final CustomerDateOfBirthSetMessage template) {
        CustomerDateOfBirthSetMessageImpl instance = new CustomerDateOfBirthSetMessageImpl();
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
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static CustomerDateOfBirthSetMessageBuilder builder() {
        return CustomerDateOfBirthSetMessageBuilder.of();
    }

    public static CustomerDateOfBirthSetMessageBuilder builder(final CustomerDateOfBirthSetMessage template) {
        return CustomerDateOfBirthSetMessageBuilder.of(template);
    }

    default <T> T withCustomerDateOfBirthSetMessage(Function<CustomerDateOfBirthSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDateOfBirthSetMessage>";
            }
        };
    }
}
