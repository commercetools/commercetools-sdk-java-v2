
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveDiscountCodeAction cartRemoveDiscountCodeAction = CartRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveDiscountCodeActionBuilder implements Builder<CartRemoveDiscountCodeAction> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public CartRemoveDiscountCodeActionBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public CartRemoveDiscountCodeActionBuilder withDiscountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReference> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @param discountCode value to be set
     * @return Builder
     */

    public CartRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @return discountCode
     */

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    /**
     * builds CartRemoveDiscountCodeAction with checking for non-null required values
     * @return CartRemoveDiscountCodeAction
     */
    public CartRemoveDiscountCodeAction build() {
        Objects.requireNonNull(discountCode, CartRemoveDiscountCodeAction.class + ": discountCode is missing");
        return new CartRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * builds CartRemoveDiscountCodeAction without checking for non-null required values
     * @return CartRemoveDiscountCodeAction
     */
    public CartRemoveDiscountCodeAction buildUnchecked() {
        return new CartRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * factory method for an instance of CartRemoveDiscountCodeActionBuilder
     * @return builder
     */
    public static CartRemoveDiscountCodeActionBuilder of() {
        return new CartRemoveDiscountCodeActionBuilder();
    }

    /**
     * create builder for CartRemoveDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveDiscountCodeActionBuilder of(final CartRemoveDiscountCodeAction template) {
        CartRemoveDiscountCodeActionBuilder builder = new CartRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
