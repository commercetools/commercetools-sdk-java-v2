
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetCustomTypeAction cartDiscountSetCustomTypeAction = CartDiscountSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetCustomTypeActionBuilder implements Builder<CartDiscountSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the CartDiscount with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
     * @return Builder
     */

    public CartDiscountSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CartDiscount with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
     * @param type
     * @return Builder
     */

    public CartDiscountSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CartDiscount.</p>
     * @return Builder
     */

    public CartDiscountSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CartDiscount.</p>
     * @param fields
     * @return Builder
     */

    public CartDiscountSetCustomTypeActionBuilder fields(
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

    public CartDiscountSetCustomTypeAction build() {
        return new CartDiscountSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CartDiscountSetCustomTypeAction without checking for non null required values
     */
    public CartDiscountSetCustomTypeAction buildUnchecked() {
        return new CartDiscountSetCustomTypeActionImpl(type, fields);
    }

    public static CartDiscountSetCustomTypeActionBuilder of() {
        return new CartDiscountSetCustomTypeActionBuilder();
    }

    public static CartDiscountSetCustomTypeActionBuilder of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionBuilder builder = new CartDiscountSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
