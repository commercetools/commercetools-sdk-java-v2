
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
     *  <p>Unique identifier of the Direct Discount.</p>
     * @param id value to be set
     * @return Builder
     */

    public DirectDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     * @param value value to be set
     * @return Builder
     */

    public DirectDiscountBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DirectDiscountBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Part of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     * @param target value to be set
     * @return Builder
     */

    public DirectDiscountBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Part of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public DirectDiscountBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the Direct Discount.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Effect of the Discount on the Cart.</p>
     * @return value
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    /**
     *  <p>Part of the Cart that is discounted.</p>
     *  <p>Empty when the <code>value</code> is set to <code>giftLineItem</code>.</p>
     * @return target
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     * builds DirectDiscount with checking for non-null required values
     * @return DirectDiscount
     */
    public DirectDiscount build() {
        Objects.requireNonNull(id, DirectDiscount.class + ": id is missing");
        Objects.requireNonNull(value, DirectDiscount.class + ": value is missing");
        return new DirectDiscountImpl(id, value, target);
    }

    /**
     * builds DirectDiscount without checking for non-null required values
     * @return DirectDiscount
     */
    public DirectDiscount buildUnchecked() {
        return new DirectDiscountImpl(id, value, target);
    }

    /**
     * factory method for an instance of DirectDiscountBuilder
     * @return builder
     */
    public static DirectDiscountBuilder of() {
        return new DirectDiscountBuilder();
    }

    /**
     * create builder for DirectDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountBuilder of(final DirectDiscount template) {
        DirectDiscountBuilder builder = new DirectDiscountBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.target = template.getTarget();
        return builder;
    }

}
