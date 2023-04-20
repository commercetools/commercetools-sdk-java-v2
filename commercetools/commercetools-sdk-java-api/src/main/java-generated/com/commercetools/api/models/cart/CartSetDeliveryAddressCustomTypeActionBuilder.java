
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDeliveryAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeliveryAddressCustomTypeAction cartSetDeliveryAddressCustomTypeAction = CartSetDeliveryAddressCustomTypeAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDeliveryAddressCustomTypeActionBuilder implements Builder<CartSetDeliveryAddressCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CartSetDeliveryAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Defines the Type that extends the Delivery <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Delivery <code>address</code>.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Delivery <code>address</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CartSetDeliveryAddressCustomTypeAction with checking for non-null required values
     * @return CartSetDeliveryAddressCustomTypeAction
     */
    public CartSetDeliveryAddressCustomTypeAction build() {
        Objects.requireNonNull(deliveryId, CartSetDeliveryAddressCustomTypeAction.class + ": deliveryId is missing");
        return new CartSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds CartSetDeliveryAddressCustomTypeAction without checking for non-null required values
     * @return CartSetDeliveryAddressCustomTypeAction
     */
    public CartSetDeliveryAddressCustomTypeAction buildUnchecked() {
        return new CartSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * factory method for an instance of CartSetDeliveryAddressCustomTypeActionBuilder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomTypeActionBuilder of() {
        return new CartSetDeliveryAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetDeliveryAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomTypeActionBuilder of(
            final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionBuilder builder = new CartSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
