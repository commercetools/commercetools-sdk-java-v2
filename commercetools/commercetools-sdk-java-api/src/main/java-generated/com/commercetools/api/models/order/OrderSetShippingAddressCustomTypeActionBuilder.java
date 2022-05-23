
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingAddressCustomTypeAction orderSetShippingAddressCustomTypeAction = OrderSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingAddressCustomTypeActionBuilder
        implements Builder<OrderSetShippingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     <*  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>>
     */

    public OrderSetShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>>
     */

    public OrderSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>>
     */

    public OrderSetShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>>
     */

    public OrderSetShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetShippingAddressCustomTypeAction build() {
        return new OrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderSetShippingAddressCustomTypeAction without checking for non null required values
     */
    public OrderSetShippingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder of() {
        return new OrderSetShippingAddressCustomTypeActionBuilder();
    }

    public static OrderSetShippingAddressCustomTypeActionBuilder of(
            final OrderSetShippingAddressCustomTypeAction template) {
        OrderSetShippingAddressCustomTypeActionBuilder builder = new OrderSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
