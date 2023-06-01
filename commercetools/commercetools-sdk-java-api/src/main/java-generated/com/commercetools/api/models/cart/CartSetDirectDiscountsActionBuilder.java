package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.DirectDiscountDraft;
import com.commercetools.api.models.cart.CartSetDirectDiscountsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetDirectDiscountsActionBuilder implements Builder<CartSetDirectDiscountsAction> {

    
    
    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */
    
    public CartSetDirectDiscountsActionBuilder discounts( final com.commercetools.api.models.cart.DirectDiscountDraft ...discounts) {
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
    
    public CartSetDirectDiscountsActionBuilder discounts( final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
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
    
    public CartSetDirectDiscountsActionBuilder plusDiscounts( final com.commercetools.api.models.cart.DirectDiscountDraft ...discounts) {
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
    
    public CartSetDirectDiscountsActionBuilder plusDiscounts(Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
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
    
    public CartSetDirectDiscountsActionBuilder withDiscounts(Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
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
    
    public CartSetDirectDiscountsActionBuilder addDiscounts(Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
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
    
    public CartSetDirectDiscountsActionBuilder setDiscounts(Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
        return discounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()));
    }
                    

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     * @return discounts
     */
    
    
    public java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> getDiscounts(){
        return this.discounts;
    }

    /**
     * builds CartSetDirectDiscountsAction with checking for non-null required values
     * @return CartSetDirectDiscountsAction
     */
    public CartSetDirectDiscountsAction build() {
        Objects.requireNonNull(discounts, CartSetDirectDiscountsAction.class + ": discounts is missing");
        return new CartSetDirectDiscountsActionImpl(discounts);
    }
    
    /**
     * builds CartSetDirectDiscountsAction without checking for non-null required values
     * @return CartSetDirectDiscountsAction
     */
    public CartSetDirectDiscountsAction buildUnchecked() {
        return new CartSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * factory method for an instance of CartSetDirectDiscountsActionBuilder
     * @return builder 
     */
    public static CartSetDirectDiscountsActionBuilder of() {
        return new CartSetDirectDiscountsActionBuilder();
    }

    /**
     * create builder for CartSetDirectDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDirectDiscountsActionBuilder of(final CartSetDirectDiscountsAction template) {
        CartSetDirectDiscountsActionBuilder builder = new CartSetDirectDiscountsActionBuilder();
        builder.discounts = template.getDiscounts();
        return builder;
    }

}
