
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerCreatedMessagePayloadBuilder implements Builder<CustomerCreatedMessagePayload> {

    private com.commercetools.api.models.customer.Customer customer;

    public CustomerCreatedMessagePayloadBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    public CustomerCreatedMessagePayloadBuilder customer(
            final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    public CustomerCreatedMessagePayload build() {
        Objects.requireNonNull(customer, CustomerCreatedMessagePayload.class + ": customer is missing");
        return new CustomerCreatedMessagePayloadImpl(customer);
    }

    /**
     * builds CustomerCreatedMessagePayload without checking for non null required values
     */
    public CustomerCreatedMessagePayload buildUnchecked() {
        return new CustomerCreatedMessagePayloadImpl(customer);
    }

    public static CustomerCreatedMessagePayloadBuilder of() {
        return new CustomerCreatedMessagePayloadBuilder();
    }

    public static CustomerCreatedMessagePayloadBuilder of(final CustomerCreatedMessagePayload template) {
        CustomerCreatedMessagePayloadBuilder builder = new CustomerCreatedMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
