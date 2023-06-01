package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.common.DiscountedLineItemPortion;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPortion discountedLineItemPortion = DiscountedLineItemPortion.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountedLineItemPortionBuilder implements Builder<DiscountedLineItemPortion> {

    
    
    private com.commercetools.history.models.common.Reference discount;
    
    
    
    private com.commercetools.history.models.common.Money discountedAmount;

    
    /**
     * set the value to the discount using the builder function
     * @param builder function to build the discount value
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder discount(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the discount using the builder function
     * @param builder function to build the discount value
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder withDiscount(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.discount = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the discount
     * @param discount value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder discount( final com.commercetools.history.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }
    
    
    
    
    /**
     * set the value to the discountedAmount using the builder function
     * @param builder function to build the discountedAmount value
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder discountedAmount(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.discountedAmount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the discountedAmount using the builder function
     * @param builder function to build the discountedAmount value
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder withDiscountedAmount(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.discountedAmount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the discountedAmount
     * @param discountedAmount value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPortionBuilder discountedAmount( final com.commercetools.history.models.common.Money discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }
    
    

    /**
     * value of discount}
     * @return discount
     */
    
    
    public com.commercetools.history.models.common.Reference getDiscount(){
        return this.discount;
    }
    
    /**
     * value of discountedAmount}
     * @return discountedAmount
     */
    
    
    public com.commercetools.history.models.common.Money getDiscountedAmount(){
        return this.discountedAmount;
    }

    /**
     * builds DiscountedLineItemPortion with checking for non-null required values
     * @return DiscountedLineItemPortion
     */
    public DiscountedLineItemPortion build() {
        Objects.requireNonNull(discount, DiscountedLineItemPortion.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount, DiscountedLineItemPortion.class + ": discountedAmount is missing");
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }
    
    /**
     * builds DiscountedLineItemPortion without checking for non-null required values
     * @return DiscountedLineItemPortion
     */
    public DiscountedLineItemPortion buildUnchecked() {
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    /**
     * factory method for an instance of DiscountedLineItemPortionBuilder
     * @return builder 
     */
    public static DiscountedLineItemPortionBuilder of() {
        return new DiscountedLineItemPortionBuilder();
    }

    /**
     * create builder for DiscountedLineItemPortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
