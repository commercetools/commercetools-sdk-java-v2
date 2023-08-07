
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryCustomTypeAction orderSetDeliveryCustomTypeAction = OrderSetDeliveryCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryCustomTypeActionBuilder implements Builder<OrderSetDeliveryCustomTypeAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @param type value to be set
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @param fields value to be set
     * @return Builder
     */

    public OrderSetDeliveryCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Defines the Type that extends the Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds OrderSetDeliveryCustomTypeAction with checking for non-null required values
     * @return OrderSetDeliveryCustomTypeAction
     */
    public OrderSetDeliveryCustomTypeAction build() {
        return new OrderSetDeliveryCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * builds OrderSetDeliveryCustomTypeAction without checking for non-null required values
     * @return OrderSetDeliveryCustomTypeAction
     */
    public OrderSetDeliveryCustomTypeAction buildUnchecked() {
        return new OrderSetDeliveryCustomTypeActionImpl(deliveryId, deliveryKey, type, fields);
    }

    /**
     * factory method for an instance of OrderSetDeliveryCustomTypeActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryCustomTypeActionBuilder of() {
        return new OrderSetDeliveryCustomTypeActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryCustomTypeActionBuilder of(final OrderSetDeliveryCustomTypeAction template) {
        OrderSetDeliveryCustomTypeActionBuilder builder = new OrderSetDeliveryCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
