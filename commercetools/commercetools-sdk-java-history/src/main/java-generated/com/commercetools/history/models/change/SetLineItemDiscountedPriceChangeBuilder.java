package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.SetLineItemDiscountedPriceChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = SetLineItemDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetLineItemDiscountedPriceChangeBuilder implements Builder<SetLineItemDiscountedPriceChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private String variant;
    
    
    
    private com.commercetools.history.models.common.DiscountedLineItemPrice nextValue;
    
    
    
    private com.commercetools.history.models.common.DiscountedLineItemPrice previousValue;

    
    /**
     *  <p>Update action for <code>setLineItemDiscountedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder variant( final String variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder nextValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder withNextValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder nextValue( final com.commercetools.history.models.common.DiscountedLineItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder previousValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetLineItemDiscountedPriceChangeBuilder previousValue( final com.commercetools.history.models.common.DiscountedLineItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setLineItemDiscountedPrice</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of lineItem}
     * @return lineItem
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getLineItem(){
        return this.lineItem;
    }
    
    /**
     * value of variant}
     * @return variant
     */
    
    
    public String getVariant(){
        return this.variant;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.DiscountedLineItemPrice getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.DiscountedLineItemPrice getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetLineItemDiscountedPriceChange with checking for non-null required values
     * @return SetLineItemDiscountedPriceChange
     */
    public SetLineItemDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetLineItemDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDiscountedPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDiscountedPriceChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDiscountedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemDiscountedPriceChange.class + ": previousValue is missing");
        return new SetLineItemDiscountedPriceChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }
    
    /**
     * builds SetLineItemDiscountedPriceChange without checking for non-null required values
     * @return SetLineItemDiscountedPriceChange
     */
    public SetLineItemDiscountedPriceChange buildUnchecked() {
        return new SetLineItemDiscountedPriceChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemDiscountedPriceChangeBuilder
     * @return builder 
     */
    public static SetLineItemDiscountedPriceChangeBuilder of() {
        return new SetLineItemDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for SetLineItemDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDiscountedPriceChangeBuilder of(final SetLineItemDiscountedPriceChange template) {
        SetLineItemDiscountedPriceChangeBuilder builder = new SetLineItemDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
