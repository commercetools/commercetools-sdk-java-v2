
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDirectDiscountsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDirectDiscountsAction cartSetDirectDiscountsAction = CartSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDirectDiscountsActionBuilder implements Builder<CartSetDirectDiscountsAction> {

    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    /**
     *
     */

    public CartSetDirectDiscountsActionBuilder discounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        this.discounts = new ArrayList<>(Arrays.asList(discounts));
        return this;
    }

    /**
     *
     */

    public CartSetDirectDiscountsActionBuilder discounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
        return this;
    }

    /**
     *
     */

    public CartSetDirectDiscountsActionBuilder plusDiscounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.addAll(Arrays.asList(discounts));
        return this;
    }

    /**
     *
     */

    public CartSetDirectDiscountsActionBuilder plusDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public CartSetDirectDiscountsActionBuilder withDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        this.discounts = new ArrayList<>();
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> getDiscounts() {
        return this.discounts;
    }

    public CartSetDirectDiscountsAction build() {
        Objects.requireNonNull(discounts, CartSetDirectDiscountsAction.class + ": discounts is missing");
        return new CartSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * builds CartSetDirectDiscountsAction without checking for non null required values
     */
    public CartSetDirectDiscountsAction buildUnchecked() {
        return new CartSetDirectDiscountsActionImpl(discounts);
    }

    public static CartSetDirectDiscountsActionBuilder of() {
        return new CartSetDirectDiscountsActionBuilder();
    }

    public static CartSetDirectDiscountsActionBuilder of(final CartSetDirectDiscountsAction template) {
        CartSetDirectDiscountsActionBuilder builder = new CartSetDirectDiscountsActionBuilder();
        builder.discounts = template.getDiscounts();
        return builder;
    }

}
