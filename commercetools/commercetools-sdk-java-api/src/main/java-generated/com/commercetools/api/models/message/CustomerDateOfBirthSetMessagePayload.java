
package com.commercetools.api.models.message;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerDateOfBirthSetMessagePayloadImpl.class)
public interface CustomerDateOfBirthSetMessagePayload extends MessagePayload {

    String CUSTOMER_DATE_OF_BIRTH_SET = "CustomerDateOfBirthSet";

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public static CustomerDateOfBirthSetMessagePayload of() {
        return new CustomerDateOfBirthSetMessagePayloadImpl();
    }

    public static CustomerDateOfBirthSetMessagePayload of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadImpl instance = new CustomerDateOfBirthSetMessagePayloadImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder builder() {
        return CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }

    public static CustomerDateOfBirthSetMessagePayloadBuilder builder(
            final CustomerDateOfBirthSetMessagePayload template) {
        return CustomerDateOfBirthSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerDateOfBirthSetMessagePayload(Function<CustomerDateOfBirthSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDateOfBirthSetMessagePayload>";
            }
        };
    }
}
