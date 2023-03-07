
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingCustomTypeAction cartSetShippingCustomTypeAction = CartSetShippingCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingCustomTypeActionBuilder implements Builder<CartSetShippingCustomTypeAction> {

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>shippingKey</code> of the Shipping to customize. Used to specify which Shipping Method to customize on a Cart with <code>Multiple</code> ShippingMode. Leave this empty to customize the one and only ShippingMethod on a <code>Single</code> ShippingMode Cart.</p>
     */

    public CartSetShippingCustomTypeActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the specified ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     */

    public CartSetShippingCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the specified ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     */

    public CartSetShippingCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingMethod</code>.</p>
     */

    public CartSetShippingCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>shippingMethod</code>.</p>
     */

    public CartSetShippingCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CartSetShippingCustomTypeAction build() {
        return new CartSetShippingCustomTypeActionImpl(shippingKey, type, fields);
    }

    /**
     * builds CartSetShippingCustomTypeAction without checking for non null required values
     */
    public CartSetShippingCustomTypeAction buildUnchecked() {
        return new CartSetShippingCustomTypeActionImpl(shippingKey, type, fields);
    }

    public static CartSetShippingCustomTypeActionBuilder of() {
        return new CartSetShippingCustomTypeActionBuilder();
    }

    public static CartSetShippingCustomTypeActionBuilder of(final CartSetShippingCustomTypeAction template) {
        CartSetShippingCustomTypeActionBuilder builder = new CartSetShippingCustomTypeActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
