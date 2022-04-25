
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerFirstNameSetMessagePayloadImpl.class)
public interface CustomerFirstNameSetMessagePayload extends MessagePayload {

    String CUSTOMER_FIRST_NAME_SET = "CustomerFirstNameSet";

    @JsonProperty("firstName")
    public String getFirstName();

    public void setFirstName(final String firstName);

    public static CustomerFirstNameSetMessagePayload of() {
        return new CustomerFirstNameSetMessagePayloadImpl();
    }

    public static CustomerFirstNameSetMessagePayload of(final CustomerFirstNameSetMessagePayload template) {
        CustomerFirstNameSetMessagePayloadImpl instance = new CustomerFirstNameSetMessagePayloadImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    public static CustomerFirstNameSetMessagePayloadBuilder builder() {
        return CustomerFirstNameSetMessagePayloadBuilder.of();
    }

    public static CustomerFirstNameSetMessagePayloadBuilder builder(final CustomerFirstNameSetMessagePayload template) {
        return CustomerFirstNameSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerFirstNameSetMessagePayload(Function<CustomerFirstNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerFirstNameSetMessagePayload>";
            }
        };
    }
}
