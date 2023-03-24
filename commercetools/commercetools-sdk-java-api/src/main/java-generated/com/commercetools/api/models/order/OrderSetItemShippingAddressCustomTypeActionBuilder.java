
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetItemShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetItemShippingAddressCustomTypeAction orderSetItemShippingAddressCustomTypeAction = OrderSetItemShippingAddressCustomTypeAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<OrderSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *
     * @param addressKey value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetItemShippingAddressCustomTypeAction with checking for non-null required values
     * @return OrderSetItemShippingAddressCustomTypeAction
     */
    public OrderSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey,
            OrderSetItemShippingAddressCustomTypeAction.class + ": addressKey is missing");
        return new OrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds OrderSetItemShippingAddressCustomTypeAction without checking for non-null required values
     * @return OrderSetItemShippingAddressCustomTypeAction
     */
    public OrderSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder of() {
        return new OrderSetItemShippingAddressCustomTypeActionBuilder();
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder of(
            final OrderSetItemShippingAddressCustomTypeAction template) {
        OrderSetItemShippingAddressCustomTypeActionBuilder builder = new OrderSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
