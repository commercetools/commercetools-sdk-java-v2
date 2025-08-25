
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetShippingCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetShippingCustomTypeAction orderSetShippingCustomTypeAction = OrderSetShippingCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetShippingCustomTypeActionBuilder implements Builder<OrderSetShippingCustomTypeAction> {

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>shippingKey</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the specified ShippingMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the specified ShippingMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the specified ShippingMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingMethod</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingMethod</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingMethod</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetShippingCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The <code>shippingKey</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to customize. Used to specify which Shipping Method to customize on a Order with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Order.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the specified ShippingMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingMethod</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetShippingCustomTypeAction with checking for non-null required values
     * @return OrderSetShippingCustomTypeAction
     */
    public OrderSetShippingCustomTypeAction build() {
        return new OrderSetShippingCustomTypeActionImpl(shippingKey, type, fields);
    }

    /**
     * builds OrderSetShippingCustomTypeAction without checking for non-null required values
     * @return OrderSetShippingCustomTypeAction
     */
    public OrderSetShippingCustomTypeAction buildUnchecked() {
        return new OrderSetShippingCustomTypeActionImpl(shippingKey, type, fields);
    }

    /**
     * factory method for an instance of OrderSetShippingCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetShippingCustomTypeActionBuilder of() {
        return new OrderSetShippingCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetShippingCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetShippingCustomTypeActionBuilder of(final OrderSetShippingCustomTypeAction template) {
        OrderSetShippingCustomTypeActionBuilder builder = new OrderSetShippingCustomTypeActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
