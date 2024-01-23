
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCreatedMessagePayload cartDiscountCreatedMessagePayload = CartDiscountCreatedMessagePayload.builder()
 *             .cartDiscount(cartDiscountBuilder -> cartDiscountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountCreatedMessagePayloadBuilder implements Builder<CartDiscountCreatedMessagePayload> {

    private com.commercetools.api.models.cart_discount.CartDiscount cartDiscount;

    /**
     *  <p>The Cart Discount that was created.</p>
     * @param builder function to build the cartDiscount value
     * @return Builder
     */

    public CartDiscountCreatedMessagePayloadBuilder cartDiscount(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        this.cartDiscount = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Cart Discount that was created.</p>
     * @param builder function to build the cartDiscount value
     * @return Builder
     */

    public CartDiscountCreatedMessagePayloadBuilder withCartDiscount(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscount> builder) {
        this.cartDiscount = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of());
        return this;
    }

    /**
     *  <p>The Cart Discount that was created.</p>
     * @param cartDiscount value to be set
     * @return Builder
     */

    public CartDiscountCreatedMessagePayloadBuilder cartDiscount(
            final com.commercetools.api.models.cart_discount.CartDiscount cartDiscount) {
        this.cartDiscount = cartDiscount;
        return this;
    }

    /**
     *  <p>The Cart Discount that was created.</p>
     * @return cartDiscount
     */

    public com.commercetools.api.models.cart_discount.CartDiscount getCartDiscount() {
        return this.cartDiscount;
    }

    /**
     * builds CartDiscountCreatedMessagePayload with checking for non-null required values
     * @return CartDiscountCreatedMessagePayload
     */
    public CartDiscountCreatedMessagePayload build() {
        Objects.requireNonNull(cartDiscount, CartDiscountCreatedMessagePayload.class + ": cartDiscount is missing");
        return new CartDiscountCreatedMessagePayloadImpl(cartDiscount);
    }

    /**
     * builds CartDiscountCreatedMessagePayload without checking for non-null required values
     * @return CartDiscountCreatedMessagePayload
     */
    public CartDiscountCreatedMessagePayload buildUnchecked() {
        return new CartDiscountCreatedMessagePayloadImpl(cartDiscount);
    }

    /**
     * factory method for an instance of CartDiscountCreatedMessagePayloadBuilder
     * @return builder
     */
    public static CartDiscountCreatedMessagePayloadBuilder of() {
        return new CartDiscountCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for CartDiscountCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountCreatedMessagePayloadBuilder of(final CartDiscountCreatedMessagePayload template) {
        CartDiscountCreatedMessagePayloadBuilder builder = new CartDiscountCreatedMessagePayloadBuilder();
        builder.cartDiscount = template.getCartDiscount();
        return builder;
    }

}
