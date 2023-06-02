
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetDirectDiscountsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetDirectDiscountsAction myCartSetDirectDiscountsAction = MyCartSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetDirectDiscountsActionBuilder implements Builder<MyCartSetDirectDiscountsAction> {

    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder discounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        this.discounts = new ArrayList<>(Arrays.asList(discounts));
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder discounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder plusDiscounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.addAll(Arrays.asList(discounts));
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder plusDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder withDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        this.discounts = new ArrayList<>();
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder addDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
        return plusDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public MyCartSetDirectDiscountsActionBuilder setDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
        return discounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @return discounts
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> getDiscounts() {
        return this.discounts;
    }

    /**
     * builds MyCartSetDirectDiscountsAction with checking for non-null required values
     * @return MyCartSetDirectDiscountsAction
     */
    public MyCartSetDirectDiscountsAction build() {
        Objects.requireNonNull(discounts, MyCartSetDirectDiscountsAction.class + ": discounts is missing");
        return new MyCartSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * builds MyCartSetDirectDiscountsAction without checking for non-null required values
     * @return MyCartSetDirectDiscountsAction
     */
    public MyCartSetDirectDiscountsAction buildUnchecked() {
        return new MyCartSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * factory method for an instance of MyCartSetDirectDiscountsActionBuilder
     * @return builder
     */
    public static MyCartSetDirectDiscountsActionBuilder of() {
        return new MyCartSetDirectDiscountsActionBuilder();
    }

    /**
     * create builder for MyCartSetDirectDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetDirectDiscountsActionBuilder of(final MyCartSetDirectDiscountsAction template) {
        MyCartSetDirectDiscountsActionBuilder builder = new MyCartSetDirectDiscountsActionBuilder();
        builder.discounts = template.getDiscounts();
        return builder;
    }

}
