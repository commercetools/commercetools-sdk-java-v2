
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountReference cartDiscountReference = CartDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountReferenceBuilder implements Builder<CartDiscountReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscount obj;

    /**
     *  <p>Unique identifier of the referenced CartDiscount.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CartDiscount. Only present in responses to requests with Reference Expansion for CartDiscounts.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CartDiscountReferenceBuilder obj(
            Function<com.commercetools.api.models.cart_discount.CartDiscountBuilder, com.commercetools.api.models.cart_discount.CartDiscountBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CartDiscount. Only present in responses to requests with Reference Expansion for CartDiscounts.</p>
     * @param obj value to be set
     * @return Builder
     */

    public CartDiscountReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscount obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced CartDiscount.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded CartDiscount. Only present in responses to requests with Reference Expansion for CartDiscounts.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscount getObj() {
        return this.obj;
    }

    /**
     * builds CartDiscountReference with checking for non-null required values
     * @return CartDiscountReference
     */
    public CartDiscountReference build() {
        Objects.requireNonNull(id, CartDiscountReference.class + ": id is missing");
        return new CartDiscountReferenceImpl(id, obj);
    }

    /**
     * builds CartDiscountReference without checking for non-null required values
     * @return CartDiscountReference
     */
    public CartDiscountReference buildUnchecked() {
        return new CartDiscountReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of CartDiscountReferenceBuilder
     * @return builder
     */
    public static CartDiscountReferenceBuilder of() {
        return new CartDiscountReferenceBuilder();
    }

    /**
     * create builder for CartDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountReferenceBuilder of(final CartDiscountReference template) {
        CartDiscountReferenceBuilder builder = new CartDiscountReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
