
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupSetMessagePayloadBuilder implements Builder<CustomerGroupSetMessagePayload> {

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public CustomerGroupSetMessagePayload build() {
        Objects.requireNonNull(customerGroup, CustomerGroupSetMessagePayload.class + ": customerGroup is missing");
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    /**
     * builds CustomerGroupSetMessagePayload without checking for non null required values
     */
    public CustomerGroupSetMessagePayload buildUnchecked() {
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    public static CustomerGroupSetMessagePayloadBuilder of() {
        return new CustomerGroupSetMessagePayloadBuilder();
    }

    public static CustomerGroupSetMessagePayloadBuilder of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadBuilder builder = new CustomerGroupSetMessagePayloadBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
