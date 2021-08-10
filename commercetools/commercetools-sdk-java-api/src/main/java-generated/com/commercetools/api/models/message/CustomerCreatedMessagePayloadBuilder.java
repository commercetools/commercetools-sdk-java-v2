
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerCreatedMessagePayloadBuilder implements Builder<CustomerCreatedMessagePayload> {

    private com.commercetools.api.models.customer.Customer customer;

    public CustomerCreatedMessagePayloadBuilder customer(
            final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    public CustomerCreatedMessagePayload build() {
        Objects.requireNonNull(customer);
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
