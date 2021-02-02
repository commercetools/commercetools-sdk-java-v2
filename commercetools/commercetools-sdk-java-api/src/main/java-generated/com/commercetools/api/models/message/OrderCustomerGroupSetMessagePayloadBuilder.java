
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderCustomerGroupSetMessagePayloadBuilder {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    public OrderCustomerGroupSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OrderCustomerGroupSetMessagePayloadBuilder oldCustomerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup() {
        return this.oldCustomerGroup;
    }

    public OrderCustomerGroupSetMessagePayload build() {
        return new OrderCustomerGroupSetMessagePayloadImpl(customerGroup, oldCustomerGroup);
    }

    public static OrderCustomerGroupSetMessagePayloadBuilder of() {
        return new OrderCustomerGroupSetMessagePayloadBuilder();
    }

    public static OrderCustomerGroupSetMessagePayloadBuilder of(final OrderCustomerGroupSetMessagePayload template) {
        OrderCustomerGroupSetMessagePayloadBuilder builder = new OrderCustomerGroupSetMessagePayloadBuilder();
        builder.customerGroup = template.getCustomerGroup();
        builder.oldCustomerGroup = template.getOldCustomerGroup();
        return builder;
    }

}
