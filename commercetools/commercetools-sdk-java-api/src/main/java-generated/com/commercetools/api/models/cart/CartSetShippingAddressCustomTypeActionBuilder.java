
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
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>shippingAddress</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>shippingAddress</code>.</p>
     * @param type value to be set
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the <code>shippingAddress</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CartSetShippingAddressCustomTypeActionBuilder fields(
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
     * builds CartSetShippingAddressCustomTypeAction with checking for non-null required values
     * @return CartSetShippingAddressCustomTypeAction
     */
    public CartSetShippingAddressCustomTypeAction build() {
        return new CartSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartSetShippingAddressCustomTypeAction without checking for non-null required values
     * @return CartSetShippingAddressCustomTypeAction
     */
    public CartSetShippingAddressCustomTypeAction buildUnchecked() {
        return new CartSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CartSetShippingAddressCustomTypeActionBuilder
     * @return builder
     */
    public static CartSetShippingAddressCustomTypeActionBuilder of() {
        return new CartSetShippingAddressCustomTypeActionBuilder();
    }

    /**
     * create builder for CartSetShippingAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingAddressCustomTypeActionBuilder of(
            final CartSetShippingAddressCustomTypeAction template) {
        CartSetShippingAddressCustomTypeActionBuilder builder = new CartSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
