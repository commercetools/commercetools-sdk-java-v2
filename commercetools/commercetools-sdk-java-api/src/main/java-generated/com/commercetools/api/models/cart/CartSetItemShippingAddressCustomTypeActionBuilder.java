
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetItemShippingAddressCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetItemShippingAddressCustomTypeAction cartSetItemShippingAddressCustomTypeAction = CartSetItemShippingAddressCustomTypeAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<CartSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CartSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address in <code>itemShippingAddress</code>.</p>
     * @return addressKey
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>Defines the Type that extends the <code>itemShippingAddress</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>itemShippingAddress</code>.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>itemShippingAddress</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CartSetItemShippingAddressCustomTypeAction with checking for non-null required values
     * @return CartSetItemShippingAddressCustomTypeAction
     */
    public CartSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey,
            CartSetItemShippingAddressCustomTypeAction.class + ": addressKey is missing");
        return new CartSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds CartSetItemShippingAddressCustomTypeAction without checking for non-null required values
     * @return CartSetItemShippingAddressCustomTypeAction
     */
    public CartSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new CartSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * factory method for an instance of CartSetItemShippingAddressCustomTypeActionBuilder
     * @return builder
     */
    public static CartSetItemShippingAddressCustomTypeActionBuilder of() {
        return new CartSetItemShippingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetItemShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetItemShippingAddressCustomTypeActionBuilder of(
            final CartSetItemShippingAddressCustomTypeAction template) {
        CartSetItemShippingAddressCustomTypeActionBuilder builder = new CartSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
