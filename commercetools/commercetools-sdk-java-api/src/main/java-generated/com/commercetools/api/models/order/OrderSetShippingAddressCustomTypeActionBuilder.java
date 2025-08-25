
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetShippingAddressCustomTypeAction with checking for non-null required values
     * @return OrderSetShippingAddressCustomTypeAction
     */
    public OrderSetShippingAddressCustomTypeAction build() {
        return new OrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderSetShippingAddressCustomTypeAction without checking for non-null required values
     * @return OrderSetShippingAddressCustomTypeAction
     */
    public OrderSetShippingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of OrderSetShippingAddressCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetShippingAddressCustomTypeActionBuilder of() {
        return new OrderSetShippingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingAddressCustomTypeActionBuilder of(
            final OrderSetShippingAddressCustomTypeAction template) {
        OrderSetShippingAddressCustomTypeActionBuilder builder = new OrderSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
