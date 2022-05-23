
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressCustomTypeAction cartSetShippingAddressCustomTypeAction = CartSetShippingAddressCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingAddressCustomTypeActionBuilder implements Builder<CartSetShippingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     <*  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>>
     */

    public CartSetShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Defines the Type that extends the <code>shippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>>
     */

    public CartSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>>
     */

    public CartSetShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Sets the Custom Fields fields for the <code>shippingAddress</code>.</p>>
     */

    public CartSetShippingAddressCustomTypeActionBuilder fields(
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

    public CartSetShippingAddressCustomTypeAction build() {
        return new CartSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartSetShippingAddressCustomTypeAction without checking for non null required values
     */
    public CartSetShippingAddressCustomTypeAction buildUnchecked() {
        return new CartSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static CartSetShippingAddressCustomTypeActionBuilder of() {
        return new CartSetShippingAddressCustomTypeActionBuilder();
    }

    public static CartSetShippingAddressCustomTypeActionBuilder of(
            final CartSetShippingAddressCustomTypeAction template) {
        CartSetShippingAddressCustomTypeActionBuilder builder = new CartSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
