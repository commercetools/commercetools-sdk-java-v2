package com.commercetools.history.models.common;

import com.commercetools.history.models.common.DiscountedLineItemPortion;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.DiscountedLineItemPrice;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPrice discountedLineItemPrice = DiscountedLineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountedLineItemPriceBuilder implements Builder<DiscountedLineItemPrice> {

    
    
    private com.commercetools.history.models.common.Money value;
    
    
    
    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts;

    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder value(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder withValue(Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder value( final com.commercetools.history.models.common.Money value) {
        this.value = value;
        return this;
    }
    
    
    
    /**
     * set values to the includedDiscounts
     * @param includedDiscounts value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder includedDiscounts( final com.commercetools.history.models.common.DiscountedLineItemPortion ...includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }
    
    /**
     * set value to the includedDiscounts
     * @param includedDiscounts value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder includedDiscounts( final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }
    
    /**
     * add values to the includedDiscounts
     * @param includedDiscounts value to be set
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder plusIncludedDiscounts( final com.commercetools.history.models.common.DiscountedLineItemPortion ...includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }
    
    
    
    /**
     * add the value to the includedDiscounts using the builder function
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.add(builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the includedDiscounts using the builder function
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder withIncludedDiscounts(Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts.add(builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the includedDiscounts using the builder function
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder addIncludedDiscounts(Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortion> builder) {
        return plusIncludedDiscounts(builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()));
    }
    
    /**
     * set the value to the includedDiscounts using the builder function
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */
    
    public DiscountedLineItemPriceBuilder setIncludedDiscounts(Function<com.commercetools.history.models.common.DiscountedLineItemPortionBuilder, com.commercetools.history.models.common.DiscountedLineItemPortion> builder) {
        return includedDiscounts(builder.apply(com.commercetools.history.models.common.DiscountedLineItemPortionBuilder.of()));
    }
                    

    /**
     * value of value}
     * @return value
     */
    
    
    public com.commercetools.history.models.common.Money getValue(){
        return this.value;
    }
    
    /**
     * value of includedDiscounts}
     * @return includedDiscounts
     */
    
    
    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> getIncludedDiscounts(){
        return this.includedDiscounts;
    }

    /**
     * builds DiscountedLineItemPrice with checking for non-null required values
     * @return DiscountedLineItemPrice
     */
    public DiscountedLineItemPrice build() {
        Objects.requireNonNull(value, DiscountedLineItemPrice.class + ": value is missing");
        Objects.requireNonNull(includedDiscounts, DiscountedLineItemPrice.class + ": includedDiscounts is missing");
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }
    
    /**
     * builds DiscountedLineItemPrice without checking for non-null required values
     * @return DiscountedLineItemPrice
     */
    public DiscountedLineItemPrice buildUnchecked() {
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }

    /**
     * factory method for an instance of DiscountedLineItemPriceBuilder
     * @return builder 
     */
    public static DiscountedLineItemPriceBuilder of() {
        return new DiscountedLineItemPriceBuilder();
    }

    /**
     * create builder for DiscountedLineItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceBuilder builder = new DiscountedLineItemPriceBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}
