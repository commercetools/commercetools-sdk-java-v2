
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DirectDiscountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscount directDiscount = DirectDiscount.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountBuilder implements Builder<DirectDiscount> {

    private String id;

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     *  <p>The unique ID of the cart discount.</p>
     */

    public DirectDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public DirectDiscountBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *
     */

    public DirectDiscountBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public DirectDiscountBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */

    public DirectDiscountBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public DirectDiscount build() {
        Objects.requireNonNull(id, DirectDiscount.class + ": id is missing");
        Objects.requireNonNull(value, DirectDiscount.class + ": value is missing");
        return new DirectDiscountImpl(id, value, target);
    }

    /**
     * builds DirectDiscount without checking for non null required values
     */
    public DirectDiscount buildUnchecked() {
        return new DirectDiscountImpl(id, value, target);
    }

    public static DirectDiscountBuilder of() {
        return new DirectDiscountBuilder();
    }

    public static DirectDiscountBuilder of(final DirectDiscount template) {
        DirectDiscountBuilder builder = new DirectDiscountBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.target = template.getTarget();
        return builder;
    }

}
