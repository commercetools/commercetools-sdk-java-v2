
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryAddressCustomTypeAction orderSetDeliveryAddressCustomTypeAction = OrderSetDeliveryAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryAddressCustomTypeActionBuilder
        implements Builder<OrderSetDeliveryAddressCustomTypeAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetDeliveryAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetDeliveryAddressCustomTypeAction with checking for non-null required values
     * @return OrderSetDeliveryAddressCustomTypeAction
     */
    public OrderSetDeliveryAddressCustomTypeAction build() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * builds OrderSetDeliveryAddressCustomTypeAction without checking for non-null required values
     * @return OrderSetDeliveryAddressCustomTypeAction
     */
    public OrderSetDeliveryAddressCustomTypeAction buildUnchecked() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * factory method for an instance of OrderSetDeliveryAddressCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new OrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryAddressCustomTypeActionBuilder of(
            final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionBuilder builder = new OrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
