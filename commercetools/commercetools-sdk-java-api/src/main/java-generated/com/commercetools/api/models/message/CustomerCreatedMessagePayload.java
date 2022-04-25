
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
@JsonDeserialize(as = CustomerCreatedMessagePayloadImpl.class)
public interface CustomerCreatedMessagePayload extends MessagePayload {

    String CUSTOMER_CREATED = "CustomerCreated";

    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    public void setCustomer(final Customer customer);

    public static CustomerCreatedMessagePayload of() {
        return new CustomerCreatedMessagePayloadImpl();
    }

    public static CustomerCreatedMessagePayload of(final CustomerCreatedMessagePayload template) {
        CustomerCreatedMessagePayloadImpl instance = new CustomerCreatedMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static CustomerCreatedMessagePayloadBuilder builder() {
        return CustomerCreatedMessagePayloadBuilder.of();
    }

    public static CustomerCreatedMessagePayloadBuilder builder(final CustomerCreatedMessagePayload template) {
        return CustomerCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerCreatedMessagePayload(Function<CustomerCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCreatedMessagePayload>";
            }
        };
    }
}
