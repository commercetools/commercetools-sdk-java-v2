
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerLastNameSetMessagePayloadImpl.class)
public interface CustomerLastNameSetMessagePayload extends MessagePayload {

    String CUSTOMER_LAST_NAME_SET = "CustomerLastNameSet";

    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static CustomerLastNameSetMessagePayload of() {
        return new CustomerLastNameSetMessagePayloadImpl();
    }

    public static CustomerLastNameSetMessagePayload of(final CustomerLastNameSetMessagePayload template) {
        CustomerLastNameSetMessagePayloadImpl instance = new CustomerLastNameSetMessagePayloadImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    public static CustomerLastNameSetMessagePayloadBuilder builder() {
        return CustomerLastNameSetMessagePayloadBuilder.of();
    }

    public static CustomerLastNameSetMessagePayloadBuilder builder(final CustomerLastNameSetMessagePayload template) {
        return CustomerLastNameSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerLastNameSetMessagePayload(Function<CustomerLastNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLastNameSetMessagePayload>";
            }
        };
    }
}
