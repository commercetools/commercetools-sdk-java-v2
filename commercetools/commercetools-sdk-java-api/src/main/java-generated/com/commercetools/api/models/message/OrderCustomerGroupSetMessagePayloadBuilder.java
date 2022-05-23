
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerGroupSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerGroupSetMessagePayload orderCustomerGroupSetMessagePayload = OrderCustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerGroupSetMessagePayloadBuilder implements Builder<OrderCustomerGroupSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */

    public OrderCustomerGroupSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */

    public OrderCustomerGroupSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */

    public OrderCustomerGroupSetMessagePayloadBuilder oldCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.oldCustomerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */

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

    /**
     * builds OrderCustomerGroupSetMessagePayload without checking for non null required values
     */
    public OrderCustomerGroupSetMessagePayload buildUnchecked() {
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
