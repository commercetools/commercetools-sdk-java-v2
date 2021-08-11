
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderCustomerSetMessagePayloadBuilder implements Builder<OrderCustomerSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference oldCustomer;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    public OrderCustomerSetMessagePayloadBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder oldCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.oldCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder oldCustomer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference oldCustomer) {
        this.oldCustomer = oldCustomer;
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.oldCustomerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    public OrderCustomerSetMessagePayloadBuilder oldCustomerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getOldCustomer() {
        return this.oldCustomer;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup() {
        return this.oldCustomerGroup;
    }

    public OrderCustomerSetMessagePayload build() {
        return new OrderCustomerSetMessagePayloadImpl(customer, customerGroup, oldCustomer, oldCustomerGroup);
    }

    /**
     * builds OrderCustomerSetMessagePayload without checking for non null required values
     */
    public OrderCustomerSetMessagePayload buildUnchecked() {
        return new OrderCustomerSetMessagePayloadImpl(customer, customerGroup, oldCustomer, oldCustomerGroup);
    }

    public static OrderCustomerSetMessagePayloadBuilder of() {
        return new OrderCustomerSetMessagePayloadBuilder();
    }

    public static OrderCustomerSetMessagePayloadBuilder of(final OrderCustomerSetMessagePayload template) {
        OrderCustomerSetMessagePayloadBuilder builder = new OrderCustomerSetMessagePayloadBuilder();
        builder.customer = template.getCustomer();
        builder.customerGroup = template.getCustomerGroup();
        builder.oldCustomer = template.getOldCustomer();
        builder.oldCustomerGroup = template.getOldCustomerGroup();
        return builder;
    }

}
